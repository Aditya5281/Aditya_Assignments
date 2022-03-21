package com.SpringRestAssignment_6;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	CalculatorService s = new CalculatorService();
	 
	@RequestMapping("/add")                                               //http://localhost:8080/add?n=2&m=2
	public int giveAdd(@RequestParam int n,@RequestParam int m) {         //@RequestParam is used to take the parameters
		int result=s.addService(n, m);
		return result;
	}
	
	
	@RequestMapping("/sub")                                               //http://localhost:8080/sub?n=10&m=2
	public int giveSubract(@RequestParam int n,@RequestParam int m) {
		int result=s.subtractService(n, m);
		return result;
	}
	
	
	@RequestMapping("/mul")                                               //http://localhost:8080/mul?n=10&m=2
	public int giveMultiply(@RequestParam int n,@RequestParam int m) {
		int result=s.multiplyService(n, m);
		return result;
	}
	
	
	@RequestMapping("/div")                                              //http://localhost:8080/div?n=10&m=2
	public int giveDivision(@RequestParam int n,@RequestParam int m) {
		int result=s.divideService(n, m);
		return result;
	}
	
}
