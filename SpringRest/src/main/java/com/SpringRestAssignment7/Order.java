package com.SpringRestAssignment7;

public class Order {

	int orderId;
	String orderName;
	int orderPrice;
	
	public Order(int orderId, String orderName, int orderPrice) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	
}
