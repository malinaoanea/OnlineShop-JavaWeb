package com.example.onlineShop.OnlineShop.controller;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.exception.UserNotFoundException;
import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.service.AdressService;
import com.example.onlineShop.OnlineShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AdressController {
    @Autowired
    private AdressService adressService;

    @GetMapping("/getadresa/{id}")
    public ResponseEntity<String> getAll(@PathVariable String id) {
        try {
            return ResponseEntity
                    .ok()
                    .body(adressService.getAddress(Integer.parseInt(id)));
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
