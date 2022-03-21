package com.SpringRestAssignment_5;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController                                  //means that whatever i will return will get automatically converted to json and send as HTTP response
public class EmployeeController {                //When spring going to creates the instance of this class it's going to look at all the member variables and see any of them has a dependency to EmployeeService and then it's going to inject that 
     
	@Autowired                                  //Declare the dependency employeeService
	private EmployeeService employeeService;    //member variable //By this we can ask spring for that instance
	
	
	//***********************Getting all Employees Details***********************************************
	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
  

	//***********************Getting a Employee Details**************************************************
	@GetMapping(value="/employees/{name}")	
	public Employee getEmployee(@PathVariable String name) {
		return employeeService.getEmployee(name);
	}
	
	
	//**********************Add new Employee Details*****************************************************
	@PostMapping(value="/employees")
	public void addEmployee(@RequestBody Employee employee) {    //RequestBody annotation tells spring mvc that your request payload is going to contain a json representation of this employee instance and i am asking it to take that request body and convert it into a employee instance and pass it to addEmployee then the URL is mapped anyway.    
		employeeService.addEmployee(employee);
	}
	
	
	//*********************Update an Employee Details****************************************************
	@PutMapping(value="/employees/{name}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String name) {    //RequestBody annotation tells spring mvc that your request payload is going to contain a json representation of this employee instance and i am asking it to take that request body and convert it into a employee instance and pass it to addEmployee then the URL is mapped anyway.    
		employeeService.updateEmployee(name, employee);
	}
	
	
	//***********************Deleting a Employee Details**************************************************
		@DeleteMapping(value="/employees/{name}")	
		public void deleteEmployee(@PathVariable String name) {
			 employeeService.deleteEmployee(name);
		}
}
