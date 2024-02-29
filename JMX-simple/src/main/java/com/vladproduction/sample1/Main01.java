package com.vladproduction.sample1;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

public class Main01 {
    public static void main(String[] args) throws Exception {

        MBeanServer server = MBeanServerFactory.createMBeanServer();
        Person person = new Person();
        ObjectName key = new ObjectName("person:key=value");
        server.registerMBean(person, key);

        String name = (String) server.getAttribute(key, "Name");
        System.out.println("name = " + name);
        Attribute attributeName = new Attribute("Name", "John");
        server.setAttribute(key, attributeName);
        name = (String) server.getAttribute(key, "Name");
        System.out.println("name = " + name);

        Attribute attributeAge = new Attribute("Age", 23);
        server.setAttribute(key, attributeAge);
        Integer age = (Integer) server.getAttribute(key, "Age");
        System.out.println("age = " + age);


        person.process();
        Object processResult = server.invoke(key, "process", new Object[0], new String[0]);
        System.out.println("processResult = " + processResult);
        person.calculate("avg", 1, 2);
        String action = "avg";
        int a = 1;
        int b = 2;
        Object[] params = new Object[] {action, a, b};
        String[] paramsType = new String[]{"java.lang.String", "int", "int"};
        Object calculateResult = server.invoke(key, "calculate", params, paramsType);
        System.out.println("calculateResult = " + calculateResult);

    }
}
