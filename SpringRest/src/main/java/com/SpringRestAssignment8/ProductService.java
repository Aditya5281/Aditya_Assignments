package com.SpringRestAssignment8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {


	@Autowired
	ProductRepo productRepo;
	public static List<Product> odrs=new ArrayList<>();
	void createProduct() {
		productRepo.save(new Product("1","Shoes","15000"));
		productRepo.save(new Product("2","Socks","150"));
		productRepo.save(new Product("3","Slippers","1500"));
		productRepo.save(new Product("4","Shorts","1800"));
	}
	//Getting order
	public List<Product> getAll(){
		createProduct();
		return productRepo.findAll();
	}
	//Getting specific Order
//	public Order getOrder(int id) {
//		return orderRepo.findOne(id);
//	}
	//Placing Order
	public void addProduct(Product o) {
		productRepo.save(o);
	}
	//Updating Order
	public void updateProduct(Product odr, String id) {
		if(id==odr.getProductId()) {
			productRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllProduct() {
		productRepo.deleteAll();
	}
		
}
