package com.example.onlineShop.OnlineShop.controller;


import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.exception.UserNotFoundException;
import com.example.onlineShop.OnlineShop.mapper.UserMapper;
import com.example.onlineShop.OnlineShop.models.User;
import com.example.onlineShop.OnlineShop.service.UserService;
import org.mapstruct.control.MappingControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private UserMapper userMapper;

    @PostMapping("/createUser")
    public ResponseEntity<UserDto> createClient(@RequestBody UserDto userDto) {
        return ResponseEntity
                .ok()
                .body(userService.create(userDto));
    }


    @PostMapping("/vla")
    public ResponseEntity<UserDto> editUserType(@RequestParam(name = "email") String email, @RequestParam(name = "type") String type) {
        return ResponseEntity.ok().body(userService.editUserType(email, type));
    }


    @GetMapping("/allusers")
    public ResponseEntity<List<UserDto>> getAll() {
        try {
            return ResponseEntity
                    .ok()
                    .body(userService.getAll());
        } catch (UserNotFoundException exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }




}
