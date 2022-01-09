package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.Cart;
import com.example.onlineShop.OnlineShop.models.User;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComandaDto {
    long id;
    Cart cart;
    User user;
    int total_price;
}
