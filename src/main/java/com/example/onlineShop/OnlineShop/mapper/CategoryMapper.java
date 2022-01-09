package com.example.onlineShop.OnlineShop.mapper;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.dto.CategoryDto;
import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryDto categoryToDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .category_name(category.getCategory_name())
                .products(category.getProducts())
                .build();
    }

    public Category mapToEntity(CategoryDto categoryDto) {
        return Category.builder()
                .id(categoryDto.getId())
                .category_name(categoryDto.getCategory_name())
                .products(categoryDto.getProducts())
                .build();
    }
}
