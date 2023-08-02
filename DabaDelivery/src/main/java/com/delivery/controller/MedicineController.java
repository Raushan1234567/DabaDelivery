package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Medicine;
import com.delivery.service.MedicineServiceInterface;

import jakarta.validation.Valid;

@RestController
public class MedicineController {

	@Autowired
	private MedicineServiceInterface medicineServiceInterface;
	
	@PostMapping("/medicines")
	public ResponseEntity<Medicine> addMedcine(@Valid @RequestBody Medicine medicine){
		return new ResponseEntity<Medicine>(medicineServiceInterface.addMedicine(medicine),HttpStatus.CREATED);
		
	}
	
}
