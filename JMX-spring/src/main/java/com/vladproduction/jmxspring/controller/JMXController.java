package com.vladproduction.jmxspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jmx")
public class JMXController {

    @GetMapping("/getMessage")
    public void getMessage(){

    }

    @PostMapping("/postMessage")
    public void postMessage(){

    }
}
