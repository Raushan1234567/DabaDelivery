package com.delivery.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Medicine> getMedicine() {
		// TODO Auto-generated method stub
		List<Medicine> list=MedicineRepositry.findAll();
		
		return list;
	}

	@Override
	public Medicine getMedicineById(Integer medicineId) {
		// TODO Auto-generated method stub
		Optional<Medicine> list=MedicineRepositry.findById(medicineId);
		return list.get();
	}

	@Override
	public String deleteMedcineById(Integer medicineId) {
		MedicineRepositry.deleteById(medicineId);
		return medicineId+" medicine Id Delete";
	}

}
