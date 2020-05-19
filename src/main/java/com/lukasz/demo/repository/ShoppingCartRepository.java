package com.lukasz.demo.repository;

import com.lukasz.demo.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
