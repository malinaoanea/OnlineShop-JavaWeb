package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.dto.ProductDto;
import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDto productToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .price(product.getPrice())
                .name(product.getName())
                .build();
    }

    public Product mapToEntity(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .build();
    }
}
