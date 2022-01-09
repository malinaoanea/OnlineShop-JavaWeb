package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.ProductDto;
import com.example.onlineShop.OnlineShop.mapper.AddressMapper;
import com.example.onlineShop.OnlineShop.mapper.ProductMapper;
import com.example.onlineShop.OnlineShop.models.Product;
import com.example.onlineShop.OnlineShop.repository.AdresRepository;
import com.example.onlineShop.OnlineShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.getAll();
        return products.stream().map(u -> productMapper.productToDto(u)).collect(Collectors.toList());
    }

    public List<ProductDto> getProductOfCtegory(long id) {
        List<Product> products = productRepository.getProductByCategory(id);
        return products.stream().map(u -> productMapper.productToDto(u)).collect(Collectors.toList());
    }

    public boolean getProductWithId(long id) {
        return productRepository.existsById(id);
    }
}
