package com.rabbitMQCustomer.Repository;

import com.rabbitMQCustomer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepo extends MongoRepository<Customer,String> {
}
