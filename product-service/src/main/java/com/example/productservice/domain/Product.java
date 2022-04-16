package com.example.productservice.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
