package com.example.rabbitmqconsumers.Service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rabbitmqconsumers.Config.ConsumerConfig;
import com.example.rabbitmqconsumers.Model.ConsumersModel;
import com.example.rabbitmqconsumers.repository.ConsumerRepo;


@Component
public class ConsumersService {

	@Autowired
	private ConsumerRepo repo;
	
	@RabbitListener(queues = ConsumerConfig.QUEUE)
	    public void listener(ConsumersModel message) {
	        System.out.println(message);
	        repo.save(message);
	    }

}
