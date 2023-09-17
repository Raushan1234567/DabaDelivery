package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.Orders;
import com.delivery.repositry.CustomerRepositry;
import com.delivery.repositry.OrdersRepositry;
import com.delivery.repositry.PaymentRepositry;

@Service
public class OredersServiceImplementation implements OrdersServiceInterface {
@Autowired
	private OrdersRepositry or;
@Autowired
private CustomerRepositry cr;
@Autowired
private PaymentRepositry pr;
	@Override
	public Orders addToOrder(Orders orders, Integer customerId) {
		
		orders.setCustomer(cr.findById(customerId).get());
		or.save(orders);
		return orders;
	}
	@Override
	public Orders addPayment(Integer orderId, Integer paymentId) {
		
		Orders o=or.findById(orderId).get();
		o.setPaymentId(pr.findById(paymentId).get());
		or.save(o);
		return o;
	}
	
}
