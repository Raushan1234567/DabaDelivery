package com.delivery.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends AbstractUser{
	
	@Column(unique = true)
	private int customerId;
	
	
	@NotBlank(message = "Name should not be blank")
	private String name;
	
	
	@NotNull
	private String address;
	
	
	@NotNull
	private String mobileNumber;
	
	@OneToOne
	@JoinColumn(name = "cart_Id")
	@JsonIgnore
	private Cart cart;
	
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<Orders> orderList=new ArrayList<>();
}
