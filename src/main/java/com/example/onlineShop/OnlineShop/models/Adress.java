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
@Table(name = "adresses")
public class Adress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "adress")
    private String adress;


    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

}

