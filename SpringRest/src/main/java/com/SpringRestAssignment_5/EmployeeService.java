package com.SpringRestAssignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service            //this going to create instance of all the classes and it's going to make a note of it
public class EmployeeService {
     
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(       //i only have a one copy of this Employee and can't create new one every time
			new Employee("1", "Aditya", "CSE", "Employee1", "10000"),	    //Create new Topic object
			new Employee("2", "Amit", "ECE", "Employee2", "10001"),
			new Employee("3", "Aman", "Q", "Employee3", "10002")
			));
	
	
/////////To get all Employee Details/////////////
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	
/////////To get a Employee Details///////////////	
	public Employee getEmployee(String name) {
		return employees.stream().filter(t -> t.getEmployeeName().equals(name)).findFirst().get();   //I am going to Employee employees list and using stream to filter by name 
	}                                                                                                //It will check that if the getEmployeeName is equals to name that passed in               

	
/////////To add new Employee Details/////////////
    public void addEmployee(Employee employee) {
		employees.add(employee);	
	}

    
/////////To update an Employee Details///////////
    public void updateEmployee(String name, Employee employee) {
    	for(int i = 0; i < employees.size(); i++) {
			Employee t = employees.get(i);
			if(t.getEmployeeName().equals(name)) {
				employees.set(i, employee);
				return;
			}
		}
		
	}
  
    
//////////To delete an Employee Details//////////
    public void deleteEmployee(String name) {
		employees.removeIf(t -> t.getEmployeeName().equals(name));
	}
    
}
