package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Medicine;
import com.delivery.model.PlantMedicine;
import com.delivery.service.MedicineServiceInterface;
import com.delivery.service.PlantServiceInterface;

import jakarta.validation.Valid;

@RestController
public class PlantMedicineController {

	@Autowired
	private PlantServiceInterface plantServiceInterface;
	
	@PostMapping("/plantmedicines")
	public ResponseEntity<PlantMedicine> addMedcine(@Valid @RequestBody PlantMedicine medicine){
		return new ResponseEntity<PlantMedicine>(plantServiceInterface.addMedicine(medicine),HttpStatus.CREATED);
		
	}
	
}
