package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controller to check if the API is working
@RestController
public class HealthCheck {
    // "GET" means get request
    @GetMapping("/health-check") // mapping the below function to an end point
    public String healthCheck(){
        // automatically converts string to JSON
        return "OK URL WORKING !!";
    }
}
