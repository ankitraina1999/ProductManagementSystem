package com.cybage.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.cybage.model.Product;
import com.cybage.service.ProductService;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
    
    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
     
   
}
