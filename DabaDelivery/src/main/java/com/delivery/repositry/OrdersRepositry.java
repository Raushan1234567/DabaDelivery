package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Orders;

public interface OrdersRepositry extends JpaRepository<Orders, Integer>{

}
