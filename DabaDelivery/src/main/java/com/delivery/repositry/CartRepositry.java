package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Cart;

public interface CartRepositry extends JpaRepository<Cart, Integer>{

}
