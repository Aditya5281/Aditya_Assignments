package com.SpringRestAssignment_8;

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
	
	
	@GetMapping(value = "/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
  

	@GetMapping(value="/products/{id}")	
	public Product getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}
	

	@PostMapping(value="/products")
	public void addProduct(@RequestBody Product product) {    
		productService.addProduct(product);
	}
	
	
	@PutMapping(value="/products/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable String id) {        
		productService.updateProduct(id, product);
	}
	
	
		@DeleteMapping(value="/products/{id}")	
		public void deleteProduct(@PathVariable String id) {
			productService.deleteProduct(id);
		}
}
