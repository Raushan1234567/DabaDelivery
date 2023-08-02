package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.AnimalMedicine;
import com.delivery.model.Medicine;
import com.delivery.service.AnimalServiceInterface;

import jakarta.validation.Valid;

@RestController
public class AnimalMedicineController {

	@Autowired
	private AnimalServiceInterface animalServiceInterface;
	
	@PostMapping("/animal_Medicines")
	public ResponseEntity<AnimalMedicine> addMedcine(@Valid @RequestBody AnimalMedicine medicine){
		return new ResponseEntity<AnimalMedicine>(animalServiceInterface.addMedicine(medicine),HttpStatus.CREATED);
		
	}
	
}
