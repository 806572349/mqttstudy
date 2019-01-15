package com.nemo.mqtt.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyApplicationTests {
    @Resource
    private MqttGateway mqttGateway;
    @Test
    public void contextLoads() {
    }


    @Test
    public void sendMqtt(String  sendData){
        mqttGateway.sendToMqtt(sendData,"hello");

    }

}

