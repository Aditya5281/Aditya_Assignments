package com.SpringRestAssignment9;

public class Customer {

	private String customerId;
	private String customerName; 
	private String customerStreet;
	private String customerCity;
	private String customerState;
	private String customerZip;
	private String customerCountry;
	
	

	public Customer(String customerId, String customerName, String customerStreet, String customerCity,
			String customerState, String customerZip, String customerCountry) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerZip = customerZip;
		this.customerCountry = customerCountry;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerStreet() {
		return customerStreet;
	}


	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	public String getCustomerState() {
		return customerState;
	}


	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}


	public String getCustomerZip() {
		return customerZip;
	}


	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}


	public String getCustomerCountry() {
		return customerCountry;
	}


	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	
	
}
