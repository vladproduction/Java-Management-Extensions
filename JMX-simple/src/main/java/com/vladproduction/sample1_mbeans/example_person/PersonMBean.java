package com.vladproduction.sample1_mbeans.example_person;

public interface PersonMBean {

    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
    String process();
    double calculate(String action, int a, int b);

}
