package com.vladproduction.messagingjmxspring.listeners;

import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.TextMessage;

/**
 * Created by vladproduction on 08-Mar-24
 */

public class ListenerA implements MessageListener {
    public void onMessage(Message message) {
        try{
            System.out.println("onMessage-ListenerA");
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
