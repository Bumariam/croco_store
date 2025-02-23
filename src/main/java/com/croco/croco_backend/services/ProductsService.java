package com.croco.croco_backend.services;

import com.croco.croco_backend.dto.ProductRequest;
import com.croco.croco_backend.dto.SimpleResponse;
import com.croco.croco_backend.models.Product;

import java.util.List;

public interface ProductsService {
    SimpleResponse create(ProductRequest productRequest);
    List<Product> getAll();
    Product getById(Long id);
}
