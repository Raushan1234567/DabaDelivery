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

import com.delivery.model.PlantMedicine;
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
	@GetMapping("/plant_Medicines")
	public ResponseEntity<List<PlantMedicine>> getMedcine(){
		return new ResponseEntity<List<PlantMedicine>>(plantServiceInterface.getplantMedicine(),HttpStatus.OK);
	}
	 
	@GetMapping("/plant_Medicines/{plantMedicineId}")
	public ResponseEntity<PlantMedicine> getMedcineById(@PathVariable Integer plantMedicineId ){
		return new ResponseEntity<PlantMedicine>(plantServiceInterface.getPlantMedicineById(plantMedicineId),HttpStatus.OK);
	}
	
	@DeleteMapping("/plant_Medicines/{plantMedicineId}")
	public ResponseEntity<String> deleteMedcineById(@PathVariable Integer plantMedicineId ){
		return new ResponseEntity<String>(plantServiceInterface.deletePlantMedcineById(plantMedicineId),HttpStatus.OK);
	}
}
