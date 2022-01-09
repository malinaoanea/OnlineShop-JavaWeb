package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.mapper.AddressMapper;
import com.example.onlineShop.OnlineShop.mapper.LotMapper;
import com.example.onlineShop.OnlineShop.repository.AdresRepository;
import com.example.onlineShop.OnlineShop.repository.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotService {
        @Autowired
        private LotRepository lotRepository;

        @Autowired
        private LotMapper lotMapper;

        public int getNumberofProducts(int id) {
            return lotRepository.getNumberofProductItems(id);
        }
}
