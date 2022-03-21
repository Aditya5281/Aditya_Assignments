package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;
public class Consumer {

	  @Id
	  public String id;

	  public String firstName;
	  public String lastName;

	  public Consumer() {}

	  public Consumer(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Consumer[id=%s, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }
	  
}
