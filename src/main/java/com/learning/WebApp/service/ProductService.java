package com.learning.WebApp.service;

import com.learning.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> products =Arrays.asList(new Product(101,"Iphone",70000), new Product(102,"Camera", 60000), new Product(103, "MacBook Air M2", 90000));

    public List<Product> getProducts(){
        return products;
    }
}

