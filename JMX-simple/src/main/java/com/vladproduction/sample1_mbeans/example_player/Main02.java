package com.vladproduction.sample1_mbeans.example_player;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

public class Main02 {
    public static void main(String[] args) throws Exception {

        //settings
        MBeanServer server = MBeanServerFactory.createMBeanServer();
        Player player1 = new Player();
        ObjectName keyPlayer1 = new ObjectName("player:key=value");
        server.registerMBean(player1, keyPlayer1);

        //enable handle our MBean
        Object name = server.getAttribute(keyPlayer1, "Name");
        System.out.println("name = " + name); //null, because not init yet, so we have to set fields for our player;

        //setting field name
        Attribute attributeName = new Attribute("Name", "Alvaro");
        server.setAttribute(keyPlayer1, attributeName);
        name = server.getAttribute(keyPlayer1, "Name");
        System.out.println("name = " + name); //Alvaro; setName() - done

        //setting field number
        Attribute attributeNumber = new Attribute("Number", 30);
        server.setAttribute(keyPlayer1, attributeNumber);
        int number = (Integer) server.getAttribute(keyPlayer1, "Number");
        System.out.println("number = " + number); //30; setAge() - done

        //setting field isRetire
        Attribute attributeIsRetire = new Attribute("IsRetire", true);
        server.setAttribute(keyPlayer1, attributeIsRetire);
        boolean isRetire = (Boolean) server.getAttribute(keyPlayer1, "IsRetire");
        System.out.println("isRetire = " + isRetire); //true; setIsRetire() - done

        //available to invoke method for MBean
        Object printInfoPlayer1 = server.invoke(keyPlayer1, "printInfo", new Object[0], new String[0]);
        System.out.println("printInfoPlayer1 = " + printInfoPlayer1);

    }
}
