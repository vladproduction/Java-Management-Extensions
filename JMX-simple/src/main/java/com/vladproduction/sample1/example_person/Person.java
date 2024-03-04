package com.vladproduction.sample1.example_person;

public class Person implements PersonMBean {

    private String name;
    private int age;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public double calculate(String action, int a, int b) {
        if("avg".equals(action)){
            return (0.0+a+b)/2; // as double 0.0
        }else return a+b;
    }

    @Override
    public String process() {
        System.out.println("process()");
        return "Person: " + name + "; " + age;
    }
}
