package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.Payment;
import com.delivery.repositry.OrdersRepositry;
import com.delivery.repositry.PaymentRepositry;

@Service
public class PaymentServiceImplementation implements PaymentServiceInterface {
	
	@Autowired
private PaymentRepositry PaymentRepositry;
	@Autowired
private OrdersRepositry or;
	
	@Override
	public Payment addTPayment(Payment payment, Integer orderId) {
		payment.setOrderId(or.findById(orderId).get());
		PaymentRepositry.save(payment);
		return payment;
	}

}
