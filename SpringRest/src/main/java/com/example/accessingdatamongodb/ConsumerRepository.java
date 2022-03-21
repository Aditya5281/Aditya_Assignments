package com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsumerRepository extends MongoRepository<Consumer, String>{

	public Consumer findByFirstName(String firstName);
	public List<Consumer> findByLastName(String lastName);
	
}
