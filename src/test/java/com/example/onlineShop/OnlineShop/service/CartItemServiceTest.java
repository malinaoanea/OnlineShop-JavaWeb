package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.repository.CartItemRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CartItemServiceTest {

    @Mock
    private CartService cartService;

    @Mock
    private CartItemRepository cartItemRepository;

    @Mock
    private  ProductService productService;

    @InjectMocks
    private CartItemService cartItemService;

    @Test
    @DisplayName("Fails to add item to cart due to cart_id.")
    void createCartItem() {
        // arrange
        when(cartService.getCartForId(any())).thenReturn(false);
        when(productService.getProductWithId(any())).thenReturn(true);

        //act
        //assert
    }

    @Test
    void deleteItems() {
    }
}