package com.bus_demo.hello_rabbitmq.rabbit_config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue setQueue(){
        return new Queue("bus_queue1");
    }
}
