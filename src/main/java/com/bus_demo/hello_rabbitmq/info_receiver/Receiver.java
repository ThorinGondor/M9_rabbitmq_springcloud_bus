package com.bus_demo.hello_rabbitmq.info_receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "bus_queue1") //监听名为 bus_queue 的消息队列
public class Receiver {

    @RabbitHandler
    public void receive_message(String message){
        System.out.println("Receiver: " + message);
    }
}
