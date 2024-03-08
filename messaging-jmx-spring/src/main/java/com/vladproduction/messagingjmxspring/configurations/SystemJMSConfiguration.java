package com.vladproduction.messagingjmxspring.configurations;

import com.vladproduction.messagingjmxspring.listeners.ListenerA;
import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerEndpoint;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

/**
 * Created by vladproduction on 08-Mar-24
 */
    // ConnectionFactory --> to ActiveMQ
    // DefaultMessageListenerContainer

@Configuration
@EnableJms
public class SystemJMSConfiguration {

    @Bean
    public ConnectionFactory connectionFactory(){return new ActiveMQConnectionFactory();}

    @Bean
    public DefaultMessageListenerContainer defaultMessageListenerContainer(ConnectionFactory connectionFactory){
        //init
        DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory(); //for settings
        SimpleJmsListenerEndpoint listenerEndpoint = new SimpleJmsListenerEndpoint(); //for listener
        listenerEndpoint.setMessageListener(new ListenerA()); //setter for concrete listener: ListenerA
        DefaultMessageListenerContainer listenerContainer = defaultJmsListenerContainerFactory.createListenerContainer(listenerEndpoint);

        //setters
        listenerContainer.setConcurrency("1-3");
        listenerContainer.setIdleConsumerLimit(1000);
        listenerContainer.setIdleTaskExecutionLimit(60 * 60);
        listenerContainer.setConnectionFactory(connectionFactory);
        listenerContainer.setDestinationName("messaging-jmx-spring");
        listenerContainer.setAutoStartup(true);

        //return listenerContainer
        return listenerContainer;

    }

}
