package com.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Customer;
import com.delivery.service.CustomerServiceInterface;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> add(@Valid @RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerServiceInterface.registerCustomer(customer),HttpStatus.OK);
	}
	

	@GetMapping("/customers_List")
	public ResponseEntity<List<Customer>> getCustomer(){
		return new ResponseEntity<List<Customer>>(customerServiceInterface.getCustomer(),HttpStatus.OK);
	}
	

	
}
