package com.nemo.mqtt.study;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.util.StringUtils;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class DefaultMessageHandler extends AbstractMessageHandler {


    @Override
    protected void handleMessageInternal(Message<?> message) throws Exception {

        String payload = message.getPayload().toString();
        JsonData jsonData = JSON.parseObject(payload, JsonData.class);
        Object data = jsonData.getData();
        List<TransData> transData = JSONObject.parseArray(JSON.toJSONString(data), TransData.class);

        System.out.println(transData);
        System.out.println(payload);
        MessageHeaders headers = message.getHeaders();
//        headers.entrySet().forEach(a-> System.out.println("key:"+a.getKey()+"value:"+a.getValue()));
        //年末
        //4901
        //5901
        //5952
        //5981
        //6982
        //11982
    }
}
