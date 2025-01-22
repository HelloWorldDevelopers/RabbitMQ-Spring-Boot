package com.RabbitMQDEMO.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message1) {
     	for (int i = 0; i < 1000; i++) {	
    		rabbitTemplate.convertAndSend("ea", "k", message1);
		}
        return "Message sent: " + message1;
    }
}
