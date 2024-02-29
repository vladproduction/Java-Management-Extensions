package com.vladproduction.sample2;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

public class Main02 {
    public static void main(String[] args) throws Exception {

        MBeanServer server = MBeanServerFactory.createMBeanServer();
        Car car1 = new Car();
        ObjectName car1key = new ObjectName("car1key:key=value");
        server.registerMBean(car1, car1key);

        Garage garage = new Garage();
        server.addNotificationListener(car1key, garage, null, null);

        Attribute attributeName = new Attribute("Name", "BMW");
        server.setAttribute(car1key, attributeName);



    }
}
