package com.SpringRestAssignment9;

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
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	//Get all order
	@GetMapping("/customer")
	public List<Customer> getAllOrders(){
		return customerService.getAll();
	}
	//place an order
	@PostMapping("/placeCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	//Update an order
	@PutMapping("/customer/{id}")
	public void updateCustomer(@RequestBody Customer o,@PathVariable String id) {
		customerService.updateCustomer(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteCustomer")
	public void deleteAllCustomer() {
		customerService.deleteAllCustomer();
	}
	
}
