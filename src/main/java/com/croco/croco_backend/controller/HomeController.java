package com.croco.croco_backend.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "главная стр");
        return "home";
    }


}
