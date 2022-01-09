package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.Product;
import com.example.onlineShop.OnlineShop.models.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotDto {
    private long id;
    private Product product;
    private int number;

}
