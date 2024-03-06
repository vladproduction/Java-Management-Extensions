package com.vladproduction.jmxspring.configuration;

import com.vladproduction.jmxspring.consumer.ListenerB;
import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerEndpoint;
import org.springframework.jms.config.SimpleJmsListenerEndpoint;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

@Configuration
@EnableJms
public class JMSConfig {

    @Bean
    public ConnectionFactory connectionFactory() {

        return new ActiveMQConnectionFactory();
    }

    @Bean
    public DefaultMessageListenerContainer defaultMessageListenerContainer(ConnectionFactory connectionFactory){

        DefaultJmsListenerContainerFactory containerFactory = new DefaultJmsListenerContainerFactory();
        SimpleJmsListenerEndpoint listenerEndpoint = new SimpleJmsListenerEndpoint();
        listenerEndpoint.setMessageListener(new ListenerB());
        DefaultMessageListenerContainer listenerContainer = containerFactory.createListenerContainer(listenerEndpoint);
        listenerContainer.setConcurrency("1-3");
        listenerContainer.setIdleConsumerLimit(1000);
        listenerContainer.setIdleTaskExecutionLimit(60 * 60);
        listenerContainer.setConnectionFactory(connectionFactory);
        listenerContainer.setDestinationName("Queue-jmx-spring");
        listenerContainer.setAutoStartup(true);

        return listenerContainer;
    }

}
