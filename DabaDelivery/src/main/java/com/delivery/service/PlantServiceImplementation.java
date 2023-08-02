package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.delivery.model.PlantMedicine;

import com.delivery.repositry.PlantMedicineRepositry;

@Service
public class PlantServiceImplementation implements PlantServiceInterface{

	@Autowired
	private PlantMedicineRepositry MedicineRepositry; 
	
	@Override
	public PlantMedicine addMedicine(PlantMedicine medicine) {
		// TODO Auto-generated method stub
		
		return MedicineRepositry.save(medicine);
	}

}
