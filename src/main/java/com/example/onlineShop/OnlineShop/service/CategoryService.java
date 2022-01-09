package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.CategoryDto;
import com.example.onlineShop.OnlineShop.dto.ProductDto;
import com.example.onlineShop.OnlineShop.mapper.AddressMapper;
import com.example.onlineShop.OnlineShop.mapper.CategoryMapper;
import com.example.onlineShop.OnlineShop.models.Category;
import com.example.onlineShop.OnlineShop.models.Product;
import com.example.onlineShop.OnlineShop.repository.AdresRepository;
import com.example.onlineShop.OnlineShop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    private ProductService productService;

    public List<String> getCategories() {
        return categoryRepository.getCategories();

    }

    public Long getCategoryId(String nume) {
        return categoryRepository.getPr(nume);
    }

    public List<ProductDto> getProductsFCatgeory(String category) {
        Long id = categoryRepository.getPr(category);
        System.out.println("Id categorie " +  id + "!!!!!!!!!!!!!!!!!!!!!!!!!!");
        List<ProductDto> products = productService.getProductOfCtegory(id);

        return products;
    }


}
