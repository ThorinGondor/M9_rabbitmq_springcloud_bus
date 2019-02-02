package com.bus_demo.hello_rabbitmq.info_sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send_message(){
        String message = "Hello! Today is " + new Date();

        System.out.println("Sender: " + message);
        this.amqpTemplate.convertAndSend("bus_queue1", message); //AmqpTemplate将该ctx消息发送到名为 bus_queue 的消息队列中
    }
}
