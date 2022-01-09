package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.CartItem;
import com.example.onlineShop.OnlineShop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    @Modifying
    @Query(value = "INSERT INTO cart_items (id_cart, id_product) VALUES (:cart_id, :product_id)", nativeQuery = true)
    public void addCartItem(Long cart_id, Long product_id);

    @Modifying
    @Query(value = "INSERT INTO cart_items (id_cart, id_product) VALUES (:cart_id, :product_id)", nativeQuery = true)
    public void save(Long cart_id, Long product_id);

    @Modifying
    @Query(value = "delete from cart_items where id_cart=:cart_id", nativeQuery = true)
    public void deleteByCartId(long cart_id);
}
