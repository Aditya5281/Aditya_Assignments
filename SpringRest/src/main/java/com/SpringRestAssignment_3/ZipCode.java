package com.SpringRestAssignment_3;

public class ZipCode {

	private String pinCode;
	private String state;
	private String city;
	private String country;
	
	
	public ZipCode() {
		
	}
	
	public ZipCode(String pinCode, String state, String city, String country) {
		super();
		this.pinCode = pinCode;
		this.state = state;
		this.city = city;
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "ZipCode [pinCode=" + pinCode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
	
}
