package com.delivery.service;

import java.util.List;

import com.delivery.model.Customer;

public interface CustomerServiceInterface {
	
	public Customer registerCustomer(Customer customer);
	public Customer updateCustomer(Integer customerId,Customer customer);
	public void deleteCustomer();
	public List<Customer> getCustomer();

}
