package com.webservices.restapi.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.restapi.entity.FoodProduct;
import com.webservices.restapi.service.ProductService;

@RestController
@SpringBootApplication
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addproduct")
	public FoodProduct addProduct(@RequestBody FoodProduct product) {
		return service.saveProduct(product);
		
		}
	@PostMapping("/addproducts")

	public List<FoodProduct> addProducts(@RequestBody List<FoodProduct> product){
		return service.saveProducts(product);
	}
	@GetMapping("/products")
	public List<FoodProduct> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/productById/{id}")
	public FoodProduct findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	@GetMapping("/product/{name}")
	public FoodProduct findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	@GetMapping("/{field}")
	public List<FoodProduct> getProductsWithSort(String field){
		return service.findProductsWithSorting(field);
	}
	@PutMapping("/update")
	public FoodProduct updateProduct(@RequestBody FoodProduct product) {
		return service.updateProduct(product);
		
		}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
		}
	
}
