package com.SpringRestAssignment_7;

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
public class OrderController {

	@Autowired                                  
	private OrderService orderService;   
	
	
	@GetMapping(value = "/orders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
  

	@GetMapping(value="/orders/{id}")	
	public Order getOrder(@PathVariable String id) {
		return orderService.getOrder(id);
	}
	

	@PostMapping(value="/orders")
	public void addOrder(@RequestBody Order order) {    
		orderService.addOrder(order);
	}
	
	
	@PutMapping(value="/orders/{id}")
	public void updateOrder(@RequestBody Order order, @PathVariable String id) {        
		orderService.updateOrder(id, order);
	}
	
	
		@DeleteMapping(value="/orders/{id}")	
		public void deleteOrder(@PathVariable String id) {
			orderService.deleteOrder(id);
		}
}
