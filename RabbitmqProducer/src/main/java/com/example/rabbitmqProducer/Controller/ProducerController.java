package com.example.rabbitmqProducer.Controller;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmqProducer.Config.ProducerConfig;
import com.example.rabbitmqProducer.Model.ProducerModel;

@RestController

public class ProducerController {
	
	 @Autowired
	    private RabbitTemplate template;

	    @PostMapping("/publish")
	    public String publishMessage(@RequestBody ProducerModel message) {
	        template.convertAndSend(ProducerConfig.EXCHANGE,
	                ProducerConfig.ROUTING_KEY, message);

	        return "Message Published";
	    }

}
