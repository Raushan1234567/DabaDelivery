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
	
	@GetMapping("/medicines")
	public ResponseEntity<List<Medicine>> getMedcine(){
		return new ResponseEntity<List<Medicine>>(medicineServiceInterface.getMedicine(),HttpStatus.CREATED);
	}
	
	@GetMapping("/medicines/{medicineId}")
	public ResponseEntity<Medicine> getMedcineById(@PathVariable Integer medicineId ){
		return new ResponseEntity<Medicine>(medicineServiceInterface.getMedicineById(medicineId),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/medicines/{medicineId}")
	public ResponseEntity<String> deleteMedcineById(@PathVariable Integer medicineId ){
		return new ResponseEntity<String>(medicineServiceInterface.deleteMedcineById(medicineId),HttpStatus.CREATED);
	}
}
