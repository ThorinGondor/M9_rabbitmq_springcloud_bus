package com.bus_demo.hello_rabbitmq;

import com.bus_demo.hello_rabbitmq.info_sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloRabbitmqApplication.class)
public class HelloRabbitmqApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads(){
        sender.send_message();
    }

}

