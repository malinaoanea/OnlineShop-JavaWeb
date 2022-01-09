package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.dto.LotDto;
import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.Lot;
import org.springframework.stereotype.Component;

@Component
public class LotMapper {
    public LotDto lotToDto(Lot lot) {
        return LotDto.builder()
                .number(lot.getNumber())
                .product(lot.getProduct())
                .id(lot.getId())
                .build();
    }

    public Lot mapToEntity(LotDto lotDto) {
        return Lot.builder()
                .id(lotDto.getId())
                .number(lotDto.getNumber())
                .product(lotDto.getProduct())
                .build();
    }
}
