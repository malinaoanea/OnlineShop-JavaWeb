package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.CartDto;
import com.example.onlineShop.OnlineShop.mapper.UserMapper;
import com.example.onlineShop.OnlineShop.repository.CartRepository;
import com.example.onlineShop.OnlineShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;


    @Transactional
    public long getCartIdForClient(Long client) {
        long cartId;

        if (cartRepository.userHasCart(client) == true) {

            cartId = cartRepository.getCartId(client);
        } else {
            cartRepository.addCart(client);
            cartId = cartRepository.getCartId(client);
        }
        return cartId;
    }

    public  boolean getCartForId(long id) {
        System.out.println("aici  " + cartRepository.cartExists(id));
        return cartRepository.cartExists(id);
    }
}
