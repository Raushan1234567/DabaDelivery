package com.delivery.service;

import java.util.List;


import com.delivery.model.PlantMedicine;

public interface PlantServiceInterface {

	public PlantMedicine addMedicine(PlantMedicine medicine);

	

	public PlantMedicine getPlantMedicineById(Integer plantMedicineId);

	public List<PlantMedicine> getplantMedicine();

	String deletePlantMedcineById(Integer plantMedicineId);

}
