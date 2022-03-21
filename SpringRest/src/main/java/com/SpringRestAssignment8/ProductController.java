package com.SpringRestAssignment8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	//Get all order
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAll();
	}
	//place an order
	@PostMapping("/placeProduct")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	//Update an order
	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody Product o,@PathVariable String id) {
		productService.updateProduct(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteProduct")
	public void deleteAllProduct() {
		productService.deleteAllProduct();
	}
}
