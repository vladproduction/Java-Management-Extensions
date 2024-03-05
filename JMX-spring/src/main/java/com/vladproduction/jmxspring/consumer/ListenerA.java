package com.vladproduction.jmxspring.consumer;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class ListenerA {

//    @JmsListener(destination = "Queue-jmx-spring")
    public void onMessage(Message message) throws JMSException {
        System.out.println("onMessage-ListenerA");
        if(message instanceof TextMessage){
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            System.out.println(text);
        }
    }



}
