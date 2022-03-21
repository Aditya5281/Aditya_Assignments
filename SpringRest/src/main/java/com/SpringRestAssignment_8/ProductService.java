package com.SpringRestAssignment_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ProductService {

	private List<Product> products = new ArrayList<>(Arrays.asList(      
			new Product("1", "Product1", "1000"),	    
			new Product("2", "Product2", "1001"),
			new Product("3", "Product3", "1002")
			));
	
	
	public List<Product> getAllProducts(){
		return products;
	}
	
		
	public Product getProduct(String id) {
		return products.stream().filter(t -> t.getProductId().equals(id)).findFirst().get();   
	}                                                                                                           

	
    public void addProduct(Product product) {
    	products.add(product);	
	}

    
    public void updateProduct(String id, Product product) {
    	for(int i = 0; i < products.size(); i++) {
    		Product t = products.get(i);
			if(t.getProductId().equals(id)) {
				products.set(i, product);
				return;
			}
		}
		
	}
  
    
    public void deleteProduct(String id) {
    	products.removeIf(t -> t.getProductId().equals(id));
	}
}
