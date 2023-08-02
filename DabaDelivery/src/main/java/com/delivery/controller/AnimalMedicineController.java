package com.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/animal_Medicines")
	public ResponseEntity<List<AnimalMedicine>> getMedcine(){
		return new ResponseEntity<List<AnimalMedicine>>(animalServiceInterface.getAnimalMedicine(),HttpStatus.CREATED);
	}
	
	@GetMapping("/animal_Medicines/{animalMedicineId}")
	public ResponseEntity<AnimalMedicine> getMedcineById(@PathVariable Integer animalMedicineId ){
		return new ResponseEntity<AnimalMedicine>(animalServiceInterface.getAnimalMedicineById(animalMedicineId),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/animal_Medicines/{animalMedicineId}")
	public ResponseEntity<String> deleteMedcineById(@PathVariable Integer animalMedicineId ){
		return new ResponseEntity<String>(animalServiceInterface.deleteAnimalMedcineById(animalMedicineId),HttpStatus.CREATED);
	}
}
