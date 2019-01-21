package com.nemo.mqtt.study;

import com.alibaba.fastjson.JSON;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyApplication.class)
public class StudyApplicationTests {
    @Resource
    private MqttGateway mqttGateway;
    @Test
    public void contextLoads() {
    }


    @Test
    public void sendMqtt(){
        JsonData jsonData = JsonData.success(TransData.builder().deviceCode("NCHASD1000002111").deviceName("共享单车扫码设备001")
                .deviceSecret(UUID.randomUUID().toString())
                .manufacturer("杭州市天合边城科技")
                .productionBatch("MS100000001222111")
                .productionPassword(UUID.randomUUID().toString())
                .build()
        );
        mqttGateway.sendToMqtt(JSON.toJSONString(jsonData),"topic");
    }

}

