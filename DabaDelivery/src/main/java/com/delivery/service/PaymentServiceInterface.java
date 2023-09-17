package com.delivery.service;

import com.delivery.model.Payment;


public interface PaymentServiceInterface {

	Payment addTPayment( Payment payment, Integer orderId);

}
