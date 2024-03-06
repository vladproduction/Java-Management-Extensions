package com.vladproduction.jmxspring.configuration;

import com.vladproduction.jmxspring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JMXConfig {

    @Autowired
    private DefaultMessageListenerContainer defaultMessageListenerContainer;

    @Bean
    public MBeanExporter getJMXExporter(){
        Person person1 = new Person();
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> map = new HashMap<>();
        map.put("bean:name=Person", person1);
        map.put("spring.application:type=JMSContainer,name=jmsQueueContainer", defaultMessageListenerContainer);
        exporter.setBeans(map);
        MethodNameBasedMBeanInfoAssembler assembler = new MethodNameBasedMBeanInfoAssembler();
        assembler.setManagedMethods("setMaxConcurrentConsumers", "getMaxConcurrentConsumers",
                "setConcurrentConsumers", "getConcurrentConsumers", "start", "stop", "isRunning");
        exporter.setAssembler(assembler);
        return exporter;
    }

}
