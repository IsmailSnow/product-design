package com.example.productservice.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductFacade {

    private final ProductPort productPort;

    @Override
    public List<Product> findAll() {
        return productPort.findAll();
    }

    @Override
    public void createProduct(Product product) {
        productPort.createProduct(product);
    }
}
