package com.vladproduction.jmxspring.configuration;

import com.vladproduction.jmxspring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JMXConfig {

    @Bean
    public MBeanExporter getJMXExporter(){
        Person person1 = new Person();
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> map = new HashMap<>();
        map.put("bean:name=Person", person1);
        exporter.setBeans(map);
        return exporter;
    }

}
