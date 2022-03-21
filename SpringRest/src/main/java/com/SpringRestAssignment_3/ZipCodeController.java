package com.SpringRestAssignment_3;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class ZipCodeController {
    
	@GetMapping("/zipcode")
	public List<ZipCode> pincodes() {  		
	    return Arrays.asList(			
			new ZipCode("1", "State1", "City1", "Country1"),	   
			new ZipCode("2", "State2", "City2", "Country2"),
			new ZipCode("3", "State3", "City3", "Country3")
			);
	}
	
	@GetMapping("/zipcode/{pincode}")

		public ZipCode getPinCode(@PathVariable String pincode) { 
				ZipCode zipcodes = new ZipCode("1", "State1", "City1", "Country1");
				zipcodes.setPinCode(pincode);
				return zipcodes;
	    
	}
	
}
