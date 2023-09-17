package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.delivery.model.Orders;
import com.delivery.service.OrdersServiceInterface;

import jakarta.validation.Valid;

@RestController
public class OrdersController {
@Autowired
private OrdersServiceInterface ordersServiceInterface;
	
	@PostMapping("/orders/{customerId}")
	public ResponseEntity<Orders> addOrderd(@Valid @RequestBody Orders orders,@PathVariable Integer customerId){
		return new ResponseEntity<Orders>(ordersServiceInterface.addToOrder(orders,customerId),HttpStatus.CREATED);
	}
	
	@PostMapping("/orders/{orderId}/{paymentId}")
	public ResponseEntity<Orders> addPayment(@PathVariable Integer orderId,@PathVariable Integer paymentId){
		return new ResponseEntity<Orders>(ordersServiceInterface.addPayment(orderId,paymentId),HttpStatus.CREATED);
	}
}
