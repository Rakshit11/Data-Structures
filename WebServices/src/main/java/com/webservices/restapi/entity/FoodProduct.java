package com.webservices.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foodProductTable")
public class FoodProduct {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private int quantity;

	private double price;
	public FoodProduct(String name, int quanity, double price) {
		this.name=name;
		this.quantity=quanity;
		this.price=price;
	}
	
}
