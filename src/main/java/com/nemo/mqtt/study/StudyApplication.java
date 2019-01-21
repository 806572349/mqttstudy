package com.nemo.mqtt.study;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class StudyApplication implements CommandLineRunner {

    @Autowired
    MqttGateway mqttGateway;

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i <=1; i++) {
            Thread.sleep(10);
//            mqttGateway.sendToMqtt("这是我发的多"+i,"topic",1);
            TransData transData = TransData.builder().deviceCode("NCHASD1000002111").deviceName("共享单车扫码设备001")
                    .deviceSecret(UUID.randomUUID().toString())
                    .manufacturer("杭州市天合边城科技")
                    .productionBatch("MS100000001222111")
                    .productionPassword(UUID.randomUUID().toString())
                    .build();
            JsonData jsonData = JsonData.success(Arrays.asList(transData,TransData.builder().deviceCode("NCHASD1000002111").deviceName("共享单车扫码设备001")
                    .deviceSecret(UUID.randomUUID().toString())
                    .manufacturer("杭州市天合边城科技")
                    .productionBatch("MS100000001222111")
                    .productionPassword(UUID.randomUUID().toString())
                    .build(),TransData.builder().deviceCode("NCHASD1000002111").deviceName("共享单车扫码设备001")
                    .deviceSecret(UUID.randomUUID().toString())
                    .manufacturer("杭州市天合边城科技")
                    .productionBatch("MS100000001222111")
                    .productionPassword(UUID.randomUUID().toString())
                    .build())
            );
            mqttGateway.sendToMqtt(JSON.toJSONString(jsonData),"topic",2);

        }
//        mqttGateway.sendToMqtt("这是测试","topic");

    }
}

