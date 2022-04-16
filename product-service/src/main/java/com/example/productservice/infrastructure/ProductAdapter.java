package com.example.productservice.infrastructure;


import com.example.productservice.domain.Product;
import com.example.productservice.domain.ProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductAdapter implements ProductPort {

    private final ProductRepository productRepository;
    private final ProductMapper toProductDomain;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(toProductDomain).collect(Collectors.toList());
    }

    @Override
    public void createProduct(Product product) {
        ProductEntity entity = new ProductEntity(product);
        productRepository.save(entity);
    }
}
