package com.vladproduction.sample3_notificationBroadcaster.carNotification;

import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationListener;

public class Garage implements NotificationListener {
    @Override
    public void handleNotification(Notification notification, Object handback) {
        String message = notification.getMessage();
        System.out.println("message = " + message);
        if(notification instanceof AttributeChangeNotification){
            AttributeChangeNotification attributeChangeNotification = (AttributeChangeNotification) notification;
            Object oldValue = attributeChangeNotification.getOldValue();
            Object newValue = attributeChangeNotification.getNewValue();
            System.out.println("oldValue = " + oldValue);
            System.out.println("newValue = " + newValue);
        }
    }
}
