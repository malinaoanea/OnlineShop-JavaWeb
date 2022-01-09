package com.example.onlineShop.OnlineShop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "cart_items")
public class CartItem {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne//with cart
    @JoinColumn(name="cart_id")//primaru key of cart
    @JsonIgnore
    private Cart cart;

    @ManyToOne//with cartitem
    @JoinColumn(name="product_id")
    private Product product;

    public void setId(Long id) {
        this.id = id;
    }
}
