package com.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Cart;
import com.delivery.service.CartServiceInterface;

import jakarta.validation.Valid;

@RestController
public class CartController {
	@Autowired
	private CartServiceInterface cartServiceInterface;
	
	@PostMapping("/cart")
	public ResponseEntity<Cart> addCart(@Valid @RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartServiceInterface.addToCart(cart),HttpStatus.CREATED);
	}
	@PostMapping("/addToCart/{cartId}/{medicineId}")
	public ResponseEntity<Cart> addMedcine(@PathVariable Integer medicineId, @PathVariable Integer cartId){
		return new ResponseEntity<Cart>(cartServiceInterface.addMed(medicineId,cartId),HttpStatus.CREATED);
	}
	@GetMapping("/carts")
	public ResponseEntity<List<Cart>> getMedcine(){
		return new ResponseEntity<List<Cart>>(cartServiceInterface.getMed(),HttpStatus.CREATED);
	}
}
