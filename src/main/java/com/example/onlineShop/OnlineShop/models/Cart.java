package com.example.onlineShop.OnlineShop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy="cart",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<CartItem> cartItems;

    @OneToOne
    @JoinColumn(name="userId")
    @JsonIgnore
    private User user;
    public void setId(Long id) {
        this.id = id;
    }
}
