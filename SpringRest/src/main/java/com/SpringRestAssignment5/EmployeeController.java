package com.SpringRestAssignment5;

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
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	//Get all order
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAll();
	}
	//place an order
	@PostMapping("/placeEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	//Update an order
	@PutMapping("/employees/{id}")
	public void updateOrder(@RequestBody Employee o,@PathVariable String id) {
		employeeService.updateEmployee(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteEmployee")
	public void deleteAllEmployee() {
		employeeService.deleteAllEmployee();
	}
	
}
