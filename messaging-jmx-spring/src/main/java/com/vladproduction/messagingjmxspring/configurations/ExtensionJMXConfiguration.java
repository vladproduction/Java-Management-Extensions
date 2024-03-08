package com.vladproduction.messagingjmxspring.configurations;

import com.vladproduction.messagingjmxspring.models.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vladproduction on 08-Mar-24
 */
        // MBeanExporter --> as imitation Server
        // have autowired DefaultMessageListenerContainer
@Configuration
public class ExtensionJMXConfiguration {

    @Autowired
    private DefaultMessageListenerContainer defaultMessageListenerContainer;

    @Bean
    public MBeanExporter getJMXMBeanExporter(){

        MessageModel messageModel = new MessageModel();
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> map = new HashMap<>();
        map.put("bean:name=MessageModel", messageModel); //one bean
        map.put("spring.application:type=JMSContainer,name=jmsQueueContainer", defaultMessageListenerContainer); //a few beans potential
        exporter.setBeans(map);
        MethodNameBasedMBeanInfoAssembler assembler = new MethodNameBasedMBeanInfoAssembler();
        assembler.setManagedMethods("setMaxConcurrentConsumers", "getMaxConcurrentConsumers",
                "setConcurrentConsumers", "getConcurrentConsumers", "start", "stop", "isRunning");
        exporter.setAssembler(assembler);
        return exporter;

    }
}
