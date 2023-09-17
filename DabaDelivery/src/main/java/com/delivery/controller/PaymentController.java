package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Payment;
import com.delivery.service.PaymentServiceInterface;

import jakarta.validation.Valid;

@RestController
public class PaymentController {
	@Autowired
	private PaymentServiceInterface paymentServiceInterface;
	@PostMapping("/payment/{orderId}")
	public ResponseEntity<Payment> addOrderd(@Valid @RequestBody Payment payment,@PathVariable Integer orderId){
		return new ResponseEntity<Payment>(paymentServiceInterface.addTPayment(payment,orderId),HttpStatus.CREATED);
	}
}
