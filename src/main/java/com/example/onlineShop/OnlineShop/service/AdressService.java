package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.AddressDto;
import com.example.onlineShop.OnlineShop.mapper.AddressMapper;
import com.example.onlineShop.OnlineShop.mapper.UserMapper;
import com.example.onlineShop.OnlineShop.repository.AdresRepository;
import com.example.onlineShop.OnlineShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {
        @Autowired
        private AdresRepository adresRepository;

        @Autowired
        private AddressMapper addressMapper;

        public String getAddress(int id) {
            return adresRepository.getAdressOfClient(id);
        }
}
