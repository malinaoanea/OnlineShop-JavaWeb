package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.Product;
import com.example.onlineShop.OnlineShop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select * from products", nativeQuery = true)
    List<Product> getAll();
    @Query(value = "select * from products where category_id = :id", nativeQuery = true)
    List<Product> getProductByCategory(long id);
}
