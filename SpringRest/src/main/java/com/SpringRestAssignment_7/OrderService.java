package com.SpringRestAssignment_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
	private List<Order> orders = new ArrayList<>(Arrays.asList(      
			new Order("1", "Order1", "1000"),	    
			new Order("2", "Order2", "1001"),
			new Order("3", "Order3", "1002")
			));
	
	
	public List<Order> getAllOrders(){
		return orders;
	}
	
		
	public Order getOrder(String id) {
		return orders.stream().filter(t -> t.getOrderId().equals(id)).findFirst().get();   
	}                                                                                                           

	
    public void addOrder(Order order) {
    	orders.add(order);	
	}

    
    public void updateOrder(String id, Order order) {
    	for(int i = 0; i < orders.size(); i++) {
    		Order t = orders.get(i);
			if(t.getOrderId().equals(id)) {
				orders.set(i, order);
				return;
			}
		}
		
	}
  
    
    public void deleteOrder(String id) {
    	orders.removeIf(t -> t.getOrderId().equals(id));
	}
}
