package com.example.onlineShop.OnlineShop.models;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "boughtProducts")
public class BoughtProduct {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @MapsId
    @JoinColumn(name = "comanda_id")
    private Comanda comanda;



    public void setId(Long id) {
        this.id = id;
    }
}
