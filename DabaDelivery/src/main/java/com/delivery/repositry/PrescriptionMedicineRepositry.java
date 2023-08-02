package com.delivery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.model.Prescription;

public interface PrescriptionMedicineRepositry extends JpaRepository<Prescription, Integer>{

}
