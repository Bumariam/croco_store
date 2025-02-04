package com.croco.croco_backend.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message = "The name is requaired")
    private String name;

    @NotEmpty(message = "The brand is requaired")
    private String brand;

    @NotEmpty(message = "The name is category")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 10, message = "The description should be at least 10 characters")
    @Size(max = 200, message = "The description cannot exceed 10 characters")
    private String description;

    private MultipartFile imageFile;

    public @NotEmpty(message = "The name is requaired") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "The name is requaired") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "The brand is requaired") String getBrand() {
        return brand;
    }

    public void setBrand(@NotEmpty(message = "The brand is requaired") String brand) {
        this.brand = brand;
    }

    public @NotEmpty(message = "The name is category") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty(message = "The name is category") String category) {
        this.category = category;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    public @Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 200, message = "The description cannot exceed 10 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 200, message = "The description cannot exceed 10 characters") String description) {
        this.description = description;
    }

    public MultipartFile getImageFaile() {
        return imageFile;
    }

    public void setImageFaile(MultipartFile imageFaile) {
        this.imageFile = imageFaile;
    }
}
