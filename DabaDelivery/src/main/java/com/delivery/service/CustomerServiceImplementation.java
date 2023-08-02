package com.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.exception.CustomerException;
import com.delivery.model.Customer;
import com.delivery.repositry.CustomerRepositry;

@Service
public class CustomerServiceImplementation implements CustomerServiceInterface {

	@Autowired
	private CustomerRepositry customerRepositry;
	
	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer==null) throw new CustomerException("Customer is null");
		return customerRepositry.save(customer);
	}

	@Override
	public Customer updateCustomer(Integer customerId,Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer> cus=customerRepositry.findById(customerId);
		
		if(cus==null) throw new CustomerException("Not any customer found for this specific customertId");
		
		return customerRepositry.save(cus);;
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getCustomer() {
	    // TODO Auto-generated method stub
	    List<Customer> customers = customerRepositry.findAll();
	    return customers;
	}


}
