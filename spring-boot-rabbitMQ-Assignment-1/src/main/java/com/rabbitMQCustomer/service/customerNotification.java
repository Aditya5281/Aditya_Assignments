package com.rabbitMQCustomer.service;

import com.rabbitMQCustomer.model.Customer;
import com.rabbitMQCustomer.config.RabbitMqConfig;
import com.rabbitMQCustomer.Repository.CustRepo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customerNotification {

    @Autowired
    CustRepo custRepo;

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public  void consumeMessage(Customer customer){
        custRepo.save(customer);
        System.out.println("Data added to the database Successfully");
    }
}
