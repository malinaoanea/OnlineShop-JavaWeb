package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto{
    private long id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
