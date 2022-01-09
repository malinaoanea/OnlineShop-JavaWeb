package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRepository extends JpaRepository<Lot, Long> {

    @Query(value = "select number from loturi where product_id = :id", nativeQuery = true)
    int getNumberofProductItems(int id);
}
