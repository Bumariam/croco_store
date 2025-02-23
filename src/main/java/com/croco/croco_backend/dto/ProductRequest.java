package com.croco.croco_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ProductRequest {
    @NotEmpty(message = "The name is requaired")
    private String name;

    @NotEmpty(message = "The brand is requaired")
    private String brand;

    @Min(0)
    @Size(min = 10, message = "The description should be at least 10 characters")
    @Size(max = 200, message = "The description cannot exceed 10 characters")
    private double price;
    }