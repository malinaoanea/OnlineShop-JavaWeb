package com.example.onlineShop.OnlineShop.controller;

import com.example.onlineShop.OnlineShop.dto.ProductDto;
import com.example.onlineShop.OnlineShop.exception.UserNotFoundException;
import com.example.onlineShop.OnlineShop.models.Category;
import com.example.onlineShop.OnlineShop.models.Product;
import com.example.onlineShop.OnlineShop.service.AdressService;
import com.example.onlineShop.OnlineShop.service.CategoryService;
import com.example.onlineShop.OnlineShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/categories")
    public ResponseEntity<List<String>> getAll() {
        try {
            return ResponseEntity
                    .ok()
                    .body(categoryService.getCategories());
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @GetMapping("/categories/{category}")
    public ResponseEntity<List<ProductDto>> getProductsForCategory(@PathVariable String category) {

        long id = categoryService.getCategoryId(category);

        try {
            return ResponseEntity
                    .ok()
                    .body(productService.getProductOfCtegory(id));
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
