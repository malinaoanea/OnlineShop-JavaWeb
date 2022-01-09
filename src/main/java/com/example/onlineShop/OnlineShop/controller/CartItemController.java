package com.example.onlineShop.OnlineShop.controller;

import com.example.onlineShop.OnlineShop.dto.CartItemDto;
import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.models.CartItem;
import com.example.onlineShop.OnlineShop.service.CartItemService;
import com.example.onlineShop.OnlineShop.service.CartService;
import com.example.onlineShop.OnlineShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cartItems")
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CartService cartService;

    @Autowired
    private UserService userService;

        @PostMapping("/addToCart")
    public ResponseEntity<String> addToCart( @RequestParam(name = "product_id") long product_id,@RequestParam(name = "email") String email) {

        Long email_id = userService.getIdUser(email);
        Long cart_id = cartService.getCartIdForClient(email_id);
        return ResponseEntity
                .ok()
                .body(cartItemService.createCartItem(cart_id, product_id));
    }
}
