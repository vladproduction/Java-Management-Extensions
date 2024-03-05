package com.vladproduction.jmxspring.consumer;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


public class ListenerB implements MessageListener {

    @JmsListener(destination = "Queue-jmx-spring")
    public void onMessage(Message message) {
       try{
           System.out.println("onMessage-ListenerB");
           if(message instanceof TextMessage){
               TextMessage textMessage = (TextMessage) message;
               String text = textMessage.getText();
               System.out.println(text);
           }
       }catch (Exception e){
           throw new RuntimeException(e);
       }
    }



}
