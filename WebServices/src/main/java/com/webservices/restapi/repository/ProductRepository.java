package com.webservices.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.webservices.restapi.entity.FoodProduct;

public interface ProductRepository extends JpaRepository<FoodProduct, Integer> {

	FoodProduct findByName(String name);


}
