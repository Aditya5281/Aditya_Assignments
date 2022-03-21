package com.SpringRestAssignment9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	public static List<Customer> odrs=new ArrayList<>();
	void createCustomer() {
		customerRepo.save(new Customer("1","Name1","Street1","City1","State1","Zip1","Country1"));
		customerRepo.save(new Customer("2","Name2","Street2","City2","State2","Zip2","Country2"));
		customerRepo.save(new Customer("3","Name3","Street3","City3","State3","Zip3","Country3"));
		customerRepo.save(new Customer("4","Name4","Street4","City4","State4","Zip4","Country4"));
	}
	//Getting order
	public List<Customer> getAll(){
		createCustomer();
		return customerRepo.findAll();
	}
	//Getting specific Order
//	public Order getOrder(int id) {
//		return orderRepo.findOne(id);
//	}
	//Placing Order
	public void addCustomer(Customer o) {
		customerRepo.save(o);
	}
	//Updating Order
	public void updateCustomer(Customer odr,String id) {
		if(id==odr.getCustomerId()) {
			customerRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllCustomer() {
		customerRepo.deleteAll();
	}
	
}
