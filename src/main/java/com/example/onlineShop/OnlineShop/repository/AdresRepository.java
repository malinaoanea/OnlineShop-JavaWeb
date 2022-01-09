package com.example.onlineShop.OnlineShop.repository;

import com.example.onlineShop.OnlineShop.models.Adress;
import com.example.onlineShop.OnlineShop.models.User;
import org.apache.tomcat.jni.Address;
import org.mapstruct.control.MappingControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresRepository extends JpaRepository<Adress, Long> {

    @Query(value = "select adress from adresses where user_id = :id", nativeQuery = true)
    String getAdressOfClient(int id);
}
