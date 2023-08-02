package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Payment;

public interface PaymentRepositry extends JpaRepository<Payment, Integer>{

}
