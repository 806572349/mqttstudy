package com.nemo.mqtt.study;

import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;


public class DefaultMessageHandler extends AbstractMessageHandler {


    @Override
    protected void handleMessageInternal(Message<?> message) throws Exception {
        System.out.println("收到消息："+message.getPayload().toString());

        //4901
        //5901
        //5952
        //5981
        //6982
        //11982
    }
}
