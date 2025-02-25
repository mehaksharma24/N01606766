package com.example.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/home")
    public String getHome(Model model)
    {
        model.addAttribute("message", "Welcome to homepage.");
        return "addprod";
    }
}

