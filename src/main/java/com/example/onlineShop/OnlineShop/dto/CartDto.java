package com.example.onlineShop.OnlineShop.dto;

import ch.qos.logback.core.net.server.Client;
import com.example.onlineShop.OnlineShop.models.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private long id;
    private User user;
}
