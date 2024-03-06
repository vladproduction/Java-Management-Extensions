package com.vladproduction.sample3_notificationBroadcaster.messageNotification;

import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationListener;

public class CoordinatorListener implements NotificationListener {

    @Override
    public void handleNotification(Notification notification, Object handback) {
        System.out.println("message = " + notification.getMessage());
        if(notification instanceof AttributeChangeNotification){
            AttributeChangeNotification attributeChangeNotification = (AttributeChangeNotification) notification;
            System.out.println("old = " + attributeChangeNotification.getOldValue());
            System.out.println("new = " + attributeChangeNotification.getNewValue());
        }

    }
}
