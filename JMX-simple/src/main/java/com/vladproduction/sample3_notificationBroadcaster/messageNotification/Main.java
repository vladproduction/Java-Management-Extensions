package com.vladproduction.sample3_notificationBroadcaster.messageNotification;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

public class Main {
    public static void main(String[] args) throws Exception {

        MBeanServer server = MBeanServerFactory.createMBeanServer();
        MessageModel objectMessageModel = new MessageModel();
        ObjectName keyMessageModel = new ObjectName("messageModel:key=value");
        server.registerMBean(objectMessageModel, keyMessageModel);

        CoordinatorListener coordinator = new CoordinatorListener(); // creating our listener
        server.addNotificationListener(keyMessageModel, coordinator, null, null); // listener added

        //-----------(message#1: init)---------------------------
        Attribute attrMsgText = new Attribute("MsgText", "(message#1: init)");
        server.setAttribute(keyMessageModel, attrMsgText); // changing attribute
        //to get started need to implement interface for MessageModel.class NotificationBroadcaster
        //and create private field NotificationBroadcasterSupport
        //in setMsgText(String msgText) we do logic of notification
        //and logic for overriding methods as well

        //-----------(message#2:  text test messaging)---------------------------
        //one more changing:
        attrMsgText = new Attribute("MsgText", "(message#2:  text test messaging)");
        server.setAttribute(keyMessageModel, attrMsgText);


    }
}
