package com.vladproduction.jmxspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

@EnableMBeanExport
@SpringBootApplication
public class JmxSpringApplication {


    public static void main(String[] args) {

        SpringApplication.run(JmxSpringApplication.class, args);
    }

}
