package com.croco.croco_backend.controller;

import com.croco.croco_backend.dto.SimpleResponse;
import com.croco.croco_backend.dto.ProductRequest;
import com.croco.croco_backend.models.Product;
import com.croco.croco_backend.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductsController{
   private final ProductsService productsService;

    @PostMapping("/createProduct")
    SimpleResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productsService.create(productRequest);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productsService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productsService.getById(id);
    }
}