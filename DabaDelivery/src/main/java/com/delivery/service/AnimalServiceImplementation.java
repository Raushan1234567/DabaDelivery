package com.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.AnimalMedicine;
import com.delivery.model.Medicine;
import com.delivery.repositry.AnimalMedicineRepositry;
import com.delivery.repositry.MedicineRepositry;



@Service
public class AnimalServiceImplementation implements AnimalServiceInterface {

	@Autowired
	private AnimalMedicineRepositry medicineRepositry; 
	
	@Override
	public AnimalMedicine addMedicine(AnimalMedicine medicine) {
		// TODO Auto-generated method stub
		
		return medicineRepositry.save(medicine);
	}

	@Override
	public List<AnimalMedicine> getAnimalMedicine() {
		List<AnimalMedicine> list=medicineRepositry.findAll();
		return list;
	}

	@Override
	public AnimalMedicine getAnimalMedicineById(Integer animalMedicineId) {
		// TODO Auto-generated method stub
		Optional<AnimalMedicine> list=medicineRepositry.findById(animalMedicineId);
		
		return list.get();
	}

	@Override
	public String deleteAnimalMedcineById(Integer animalMedicineId) {
		// TODO Auto-generated method stub
		medicineRepositry.deleteById(animalMedicineId);
		return "Animal medicine Id "+ animalMedicineId  + " deleted successfully";
	}

}
