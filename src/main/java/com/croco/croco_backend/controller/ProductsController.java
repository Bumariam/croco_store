package com.croco.croco_backend.controller;

import com.croco.croco_backend.dto.SimpleResponse;
import com.croco.croco_backend.dto.ProductRequest;
import com.croco.croco_backend.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductsController{
   private final ProductsService productsService;

    @PostMapping("/createProduct")
    SimpleResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productsService.create(productRequest);
    }
}