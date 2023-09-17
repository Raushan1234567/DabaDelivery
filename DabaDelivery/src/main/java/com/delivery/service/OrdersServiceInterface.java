package com.delivery.service;

import com.delivery.model.Orders;


public interface OrdersServiceInterface {

	Orders addToOrder(Orders orders, Integer customerId);

	Orders addPayment(Integer orderId, Integer paymentId);



}
