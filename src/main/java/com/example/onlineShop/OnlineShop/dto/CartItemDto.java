package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.Cart;
import com.example.onlineShop.OnlineShop.models.Product;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private long id;
    private Product product;
    private Cart cart;
}
