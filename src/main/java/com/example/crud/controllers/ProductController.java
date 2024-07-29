package com.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação que define que essa classe é um controlador REST
@RequestMapping("/product") // Define a rota base para esse controlador
public class ProductController {
    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("Ok");
    }
}

