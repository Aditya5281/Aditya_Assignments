package com.SpringRestAssignment_2;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserCredentialsController {
	

	UserCredentialsService admin1 = new UserCredentialsService();
	
	
	@PostMapping(value = "/check")
	public String Check(@RequestBody UserCredentialsService check) {
		
		admin1.setId("aditya");
		admin1.setPassword("admin");		
		
		// validation
		if(check.getId().equals(admin1.getId())){
			
			if(check.getPassword().equals(admin1.getPassword())){
				return "Valid User";	
			}
			
			else {
				return "Invalid User";
			}
			
		}
		
		else {
			return "Invalid User Function";
		}
		
	}
	
}
