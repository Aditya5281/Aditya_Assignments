package com.SpringRestAssignment5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


	@Autowired
	EmployeeRepo employeeRepo;
	public static List<Employee> odrs=new ArrayList<>();
	void createEmployee() {
	    employeeRepo.save(new Employee("1","Aditya","ECE","Student1","101"));
	    employeeRepo.save(new Employee("2","Aman","CSE","Student2","102"));
	    employeeRepo.save(new Employee("3","Amit","EEE","Student3","103"));
	    employeeRepo.save(new Employee("4","Akshat","MECH","Student4","104"));
	}
	//Getting order
	public List<Employee> getAll(){
		createEmployee();
		return employeeRepo.findAll();
	}
	//Getting specific Order
//	public Order getOrder(int id) {
//		return orderRepo.findOne(id);
//	}
	//Placing Order
	public void addEmployee(Employee o) {
		employeeRepo.save(o);
	}
	//Updating Order
	public void updateEmployee(Employee odr,String id) {
		if(id==odr.getEmployeeId()) {
			employeeRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllEmployee() {
		employeeRepo.deleteAll();
	}
	
}
