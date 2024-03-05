package com.vladproduction.jmxspring.configuration;

import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JMSConfig {

    @Bean
    public ConnectionFactory connectionFactory() {

        return new ActiveMQConnectionFactory();
    }
/**todo*/
//    @Bean
//    public DefaultJmsListenerContainerFactory listenerContainerFactory(){
//        DefaultJmsListenerContainerFactory listenerContainerFactory = new DefaultJmsListenerContainerFactory();
//        listenerContainerFactory.createListenerContainer()
//    }

}
