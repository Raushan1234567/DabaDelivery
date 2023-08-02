package com.delivery.service;

import java.util.List;

import com.delivery.model.Medicine;


public interface MedicineServiceInterface {

	public Medicine addMedicine(Medicine medicine);

	public List<Medicine> getMedicine();

	public Medicine getMedicineById(Integer medicineId);

	public String deleteMedcineById(Integer medicineId);

}
