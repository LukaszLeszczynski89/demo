package com.lukasz.demo.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// https://kobietydokodu.pl/13-baza-danych-z-jpa-cz-1/ zaczerpniete z tej strony
// prosze sie nie smiac z tytulu powazna strona jest nie wiem czemu taki tytul tylko ;)


@Entity
@Table(name = "product")
public class Product implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private Double unitPrice;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private  Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public Product(Double unitPrice, Integer quantity, String description, String name) {
        this.unitPrice = unitPrice;
        this.name = name;

    }
    public Product(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

}

