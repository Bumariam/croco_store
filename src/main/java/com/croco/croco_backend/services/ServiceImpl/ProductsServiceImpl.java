package com.croco.croco_backend.services.ServiceImpl;

import com.croco.croco_backend.Repository.ProductRepository;
import com.croco.croco_backend.dto.ProductRequest;
import com.croco.croco_backend.dto.SimpleResponse;
import com.croco.croco_backend.models.Product;
import com.croco.croco_backend.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductRepository productRepository;
    @Override
    public SimpleResponse create(ProductRequest productRequest) {
        Product product1 = new Product();
        product1.setName(productRequest.getName());
        product1.setBrand(productRequest.getBrand());
        product1.setPrice(productRequest.getPrice());


        productRepository.save(product1);
        return SimpleResponse.builder()
                .status(HttpStatus.OK)
                .message("Product created")
                .build();
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

}
