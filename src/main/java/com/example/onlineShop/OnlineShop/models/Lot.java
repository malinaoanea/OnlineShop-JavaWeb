package com.example.onlineShop.OnlineShop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loturi")
public class Lot {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number")
    private int number;

    @OneToOne
    @MapsId
    @JoinColumn(name = "product_id")
    private Product product;

}
