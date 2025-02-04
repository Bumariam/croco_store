package com.croco.croco_backend.controller;

import com.croco.croco_backend.models.Product;
import com.croco.croco_backend.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsContoller {

    @Autowired
    private ProductRepository repo;

    @GetMapping({"", "/"})
    public String showProductList (Model model){
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
