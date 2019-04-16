package com.example.practice.spring.amqp.ConsumerService;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    public void consumeMessage(String message){
        System.out.println("Recieved the message"+message);
    }
}
