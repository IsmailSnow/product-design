package com.example.productservice.domain;


import java.util.List;

public interface ProductFacade {
    List<Product> findAll();

    void createProduct(Product product);
}
