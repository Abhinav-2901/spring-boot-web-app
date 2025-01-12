package com.learning.WebApp.service;

import com.learning.WebApp.model.Product;
import com.learning.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    public List<Product> products =new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",70000),
//            new Product(102,"Camera", 60000),
//            new Product(103, "MacBook Air M2", 90000)
//    ));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductByID(int prodID) {
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }
}

