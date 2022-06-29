package com.webservices.restapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.webservices.restapi.entity.FoodProduct;
import com.webservices.restapi.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	public FoodProduct saveProduct(FoodProduct product) {
		return repository.save(product);
		
	}
	public List<FoodProduct> saveProducts(List<FoodProduct> product) {
		return repository.saveAll(product);
		
	}
	public List<FoodProduct> getProducts(){
		return repository.findAll();
	}
	public FoodProduct getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	public FoodProduct getProductByName(String name) {
		return repository.findByName(name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "FoodProduct removed !" +id;
	}

	public List<FoodProduct> findProductsWithSorting(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public Page<FoodProduct> findProductsWithPagination(int offset, int pageSize) {
		
		
		Page<FoodProduct> products = repository.findAll(PageRequest.of(offset,pageSize));
		return products;
	}
	public FoodProduct updateProduct(FoodProduct product) {
		FoodProduct existingProduct =repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}	
	
	
}
