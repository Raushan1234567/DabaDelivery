package com.delivery.service;

import java.util.List;

import com.delivery.model.AnimalMedicine;
import com.delivery.model.Medicine;

import jakarta.validation.Valid;

public interface AnimalServiceInterface {

	public AnimalMedicine addMedicine(@Valid AnimalMedicine medicine);

	public List<AnimalMedicine> getAnimalMedicine();

	public AnimalMedicine getAnimalMedicineById(Integer animalMedicineId);

	public String deleteAnimalMedcineById(Integer animalMedicineId);

}
