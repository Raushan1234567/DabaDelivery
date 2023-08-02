package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.Medicine;
import com.delivery.repositry.MedicineRepositry;

@Service
public class MedicineServiceImplementation implements MedicineServiceInterface{

	@Autowired
	private MedicineRepositry MedicineRepositry; 
	
	@Override
	public Medicine addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		
		return MedicineRepositry.save(medicine);
	}

}
