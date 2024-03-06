package com.vladproduction.jmxspring.model;

public interface PersonMBean {

    void setName(String name);
    String getName();


    void printInfo();
    void printTodayDate();
}
