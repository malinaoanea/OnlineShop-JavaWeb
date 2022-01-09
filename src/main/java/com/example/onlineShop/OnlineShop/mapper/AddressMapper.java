package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.User;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressDto addressToDto(Adress address) {
        return AddressDto.builder()
                .adress(address.getAdress())
                .id(address.getId())
                .user(address.getUser())
                .build();
    }

    public Adress mapToEntity(AddressDto addressDto) {
        return Adress.builder()
                .id(addressDto.getId())
                .adress(addressDto.getAdress())
                .user(addressDto.getUser())
                .build();
    }
}
