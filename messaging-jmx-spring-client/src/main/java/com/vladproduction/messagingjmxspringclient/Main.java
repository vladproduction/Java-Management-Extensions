package com.vladproduction.messagingjmxspringclient;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * Created by vladproduction on 08-Mar-24
 */

public class Main {
    public static void main(String[] args) throws Exception {
        String host = "localhost";
        String port = "9010";
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://" + host + ":" + port + "/jmxrmi");
        JMXConnector connector = JMXConnectorFactory.connect(url);
        MBeanServerConnection mBeanServerConnection = connector.getMBeanServerConnection();
        ObjectName objectName = new ObjectName("spring.application:type=JMSContainer,name=jmsQueueContainer");
        mBeanServerConnection.invoke(objectName, "stop", new Object[0], new String[0]);
    }
}
