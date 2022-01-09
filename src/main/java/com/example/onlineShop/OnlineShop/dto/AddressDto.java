package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private long id;
    private User user;
    private String adress;

}
