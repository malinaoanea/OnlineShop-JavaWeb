package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.CartItemDto;
import com.example.onlineShop.OnlineShop.mapper.CartItemMapper;
import com.example.onlineShop.OnlineShop.models.CartItem;
import com.example.onlineShop.OnlineShop.models.User;
import com.example.onlineShop.OnlineShop.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CartItemService {
    @Autowired
    CartItemMapper cartItemMapper;

    @Autowired
    CartItemRepository cartItemRepository;

    @Autowired
    CartService cartService;

    @Autowired
    ProductService productService;

    @Transactional
    public String createCartItem(Long cart_id,Long id_produs) {
        if (cartService.getCartForId(cart_id) == false)
            throw new RuntimeException("There is no cart with this id.");

        if (productService.getProductWithId(id_produs) == false)
            throw new RuntimeException("There is no product with this id");

        cartItemRepository.addCartItem(cart_id, id_produs);
        return "ok";

//        CartItem cartItem = cartItemMapper.mapToEntity(cartItemDto);
//
//        cartItemRepository.save(cartItem.);
//
//        car.saveUser(user.getEmail(), user.getUsertype(), user.getSurname(), user.getName());
//
//        return cartItemDto;
    }

    @Transactional
    public  void deleteItems(long cart_id) {
        cartItemRepository.deleteByCartId(cart_id);
    }
}
