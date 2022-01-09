package com.example.onlineShop.OnlineShop.dto;

import com.example.onlineShop.OnlineShop.models.Product;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private long id;
    private String category_name;
    private Set<Product> products;
}
