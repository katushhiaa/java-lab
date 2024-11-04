package com.example.labka7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHomePage() {
        return "main";
    }

    @GetMapping("/orders")
    public String showOrdersPage() {
        return "order-list";
    }
}