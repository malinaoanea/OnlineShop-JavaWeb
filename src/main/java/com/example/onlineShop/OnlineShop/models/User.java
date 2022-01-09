package com.example.onlineShop.OnlineShop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "usertype")
    private String usertype;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name="cart_id")
    private Cart cart;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Adress address;

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}
