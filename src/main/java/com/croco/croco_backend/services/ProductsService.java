package com.croco.croco_backend.services;

import com.croco.croco_backend.dto.ProductRequest;
import com.croco.croco_backend.dto.SimpleResponse;
import com.croco.croco_backend.models.Product;

public interface ProductsService {
    SimpleResponse create(ProductRequest productRequest);
}
