package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.AnimalMedicine;

public interface AnimalMedicineRepositry extends JpaRepository<AnimalMedicine, Integer>{

}
