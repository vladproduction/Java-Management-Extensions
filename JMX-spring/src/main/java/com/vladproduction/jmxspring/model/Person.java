package com.vladproduction.jmxspring.model;

public class Person implements PersonMBean{

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printInfo() {
        System.out.println("printInfo: current time");
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis/1000);
        System.out.println(this.name);
    }
}
