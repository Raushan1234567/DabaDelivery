package com.delivery.service;

import com.delivery.model.AnimalMedicine;

import jakarta.validation.Valid;

public interface AnimalServiceInterface {

	public AnimalMedicine addMedicine(@Valid AnimalMedicine medicine);

}
