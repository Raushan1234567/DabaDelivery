package com.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.exception.MedicineException;
import com.delivery.model.PlantMedicine;

import com.delivery.repositry.PlantMedicineRepositry;

@Service
public class PlantServiceImplementation implements PlantServiceInterface{

	@Autowired
	private PlantMedicineRepositry medicineRepositry; 
	
	@Override
	public PlantMedicine addMedicine(PlantMedicine medicine) {
		// TODO Auto-generated method stub
		
		return medicineRepositry.save(medicine);
	}

	@Override
	public String deletePlantMedcineById(Integer plantMedicineId) {
		// TODO Auto-generated method stub
		Optional<PlantMedicine> p=medicineRepositry.findById(plantMedicineId);
		if (!p.isPresent()) throw new MedicineException("Medicine for this particular Id is not found");
		else {
		medicineRepositry.delete(p.get());
		}
		return "Medicine Id "+  plantMedicineId +" deleted successfully";
	}

	@Override
	public PlantMedicine getPlantMedicineById(Integer plantMedicineId) {
		// TODO Auto-generated method stub
		Optional<PlantMedicine> p=medicineRepositry.findById(plantMedicineId);
		if (!p.isPresent()) throw new MedicineException("Medicine for this particular Id is not found");
		return p.get();
	}


	@Override
	public List<PlantMedicine> getplantMedicine() {
		// TODO Auto-generated method stub
		List<PlantMedicine> list=medicineRepositry.findAll();
		if(list==null) throw new MedicineException("Medicine not available");
		return list;
	}

}
