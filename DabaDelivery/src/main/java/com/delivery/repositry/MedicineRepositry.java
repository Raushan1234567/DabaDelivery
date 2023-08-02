package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Medicine;

public interface MedicineRepositry extends JpaRepository<Medicine, Integer>{

}
