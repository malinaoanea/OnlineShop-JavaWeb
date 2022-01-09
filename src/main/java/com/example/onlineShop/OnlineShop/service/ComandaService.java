package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.mapper.ComandaMapper;
import com.example.onlineShop.OnlineShop.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ComandaService {

    @Autowired
    ComandaRepository comandaRepository;

    @Autowired
    ComandaMapper comandaMapper;

    @Transactional
    public String placeComanda(long user_id, long cart_id) {
        comandaRepository.addComanda(cart_id, user_id);

        return "Comanda plasata";
    }
}
