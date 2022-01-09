package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
    @Query(value = "select category_name from categories", nativeQuery = true)
    List<String> getCategories();

    @Query(value = "select id from categories where category_name = :category", nativeQuery = true)
    Long getPr(String category);

}
