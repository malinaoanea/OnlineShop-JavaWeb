package com.example.onlineShop.OnlineShop.controller;

import com.example.onlineShop.OnlineShop.dto.ProductDto;
import com.example.onlineShop.OnlineShop.exception.UserNotFoundException;
import com.example.onlineShop.OnlineShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAll() {
        try {
            return ResponseEntity
                    .ok()
                    .body(productService.getProducts());
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
