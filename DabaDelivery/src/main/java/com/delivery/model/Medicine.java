package com.delivery.model;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medicineId;
	
	@NotBlank(message = " should not be blank")
	@NotNull
	private String medcineName;
	
	
	private double price;
	
	@PastOrPresent(message = "Manufacture date must be past or present")
	private Date manufactureDate;
	
	@Future(message = "Date should be future")
	private Date ExpiryDate;
}
