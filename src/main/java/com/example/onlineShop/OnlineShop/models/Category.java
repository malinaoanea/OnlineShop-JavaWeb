package com.example.onlineShop.OnlineShop.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    long id;

    @Column(name="category_name")
    String category_name;

    @OneToMany(mappedBy="category")
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_name='" + category_name + '\'' +
                '}';
    }
}
