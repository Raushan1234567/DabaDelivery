package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Customer;

public interface CustomerRepositry extends JpaRepository<Customer, Integer> {

}
