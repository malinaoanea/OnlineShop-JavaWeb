package com.example.onlineShop.OnlineShop.controller;

import com.example.onlineShop.OnlineShop.exception.UserNotFoundException;
import com.example.onlineShop.OnlineShop.service.AdressService;
import com.example.onlineShop.OnlineShop.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LotController {
    @Autowired
    private LotService lotService;

    @GetMapping("/thisproducts")
    public ResponseEntity<Integer> getNumber() {
        try {
            return ResponseEntity
                    .ok()
                    .body(lotService.getNumberofProducts(2));
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
