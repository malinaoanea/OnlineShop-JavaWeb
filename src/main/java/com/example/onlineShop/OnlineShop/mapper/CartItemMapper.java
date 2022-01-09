package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.CartDto;
import com.example.onlineShop.OnlineShop.dto.CartItemDto;
import com.example.onlineShop.OnlineShop.models.Cart;
import com.example.onlineShop.OnlineShop.models.CartItem;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {
    public CartItemDto mapToDto(CartItem cartItem) {
        return CartItemDto.builder()
                .id(cartItem.getId())
                .cart(cartItem.getCart())
                .build();
    }

    public CartItem mapToEntity(CartItemDto cartItemDto) {
        return CartItem.builder()
                .id(cartItemDto.getId())
                .cart(cartItemDto.getCart())
                .build();
    }
}
