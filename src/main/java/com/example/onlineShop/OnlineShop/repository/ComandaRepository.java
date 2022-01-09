package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.Category;
import com.example.onlineShop.OnlineShop.models.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Long> {

    @Modifying
    @Query(value = "INSERT INTO comenzi (cart_id, user_id) VALUES (:cart_id, :user_id)", nativeQuery = true)
    public void addComanda(long cart_id, long user_id);
}
