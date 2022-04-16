package com.example.productservice.application;

import com.example.productservice.domain.Product;
import com.example.productservice.domain.ProductFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductFacade productFacade;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return productFacade.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createProduct(@RequestBody Product product){
        productFacade.createProduct(product);
    }
}
