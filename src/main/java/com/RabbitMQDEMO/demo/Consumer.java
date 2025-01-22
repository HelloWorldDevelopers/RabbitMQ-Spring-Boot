package com.RabbitMQDEMO.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.stereotype.Service;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import java.io.IOException;

@Service
@EnableRabbit
public class Consumer implements ChannelAwareMessageListener {

//    @RabbitListener(queues = "aq")
//    public void receiveMessage(String message) throws IOException {
//        // Print the received message
//        System.out.println("Received message: " + message);
//
//       
//    }

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        // Implement logic here if necessary
    }
}
