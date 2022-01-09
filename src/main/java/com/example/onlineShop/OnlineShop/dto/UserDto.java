package com.example.onlineShop.OnlineShop.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String email;

    private String surname;
    private String name;

    private String usertype;



//    public UserDto(String name) {
//        this.name = name;
//    }
}
