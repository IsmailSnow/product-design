package com.example.productservice.infrastructure;

import com.example.productservice.domain.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ProductMapper implements Function<ProductEntity, Product> {

    @Override
    public Product apply(ProductEntity productEntity) {
        return Product.builder().id(productEntity.getId())
                .description(productEntity.getDescription())
                .name(productEntity.getName())
                .price(productEntity.getPrice())
                .build();
    }
}
