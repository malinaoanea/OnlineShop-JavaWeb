package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.CartDto;
import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.models.Cart;
import com.example.onlineShop.OnlineShop.models.User;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {
    public CartDto mapToDto(Cart cart) {
        return CartDto.builder()
                .id(cart.getId())
                .user(cart.getUser())
                .build();
    }

    public Cart mapToEntity(CartDto cartDto) {
        return Cart.builder()
                .id(cartDto.getId())
                .user(cartDto.getUser())
                .build();
    }
}
