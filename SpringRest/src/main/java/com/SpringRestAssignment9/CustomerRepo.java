package com.SpringRestAssignment9;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepo extends MongoRepository<Customer, String>{

}
