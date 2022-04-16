package com.example.productservice.domain;

import java.util.List;

public interface ProductPort {
    List<Product> findAll();

    void createProduct(Product product);
}
