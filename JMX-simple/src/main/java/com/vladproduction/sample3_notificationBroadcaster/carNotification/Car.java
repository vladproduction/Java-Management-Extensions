package com.vladproduction.sample3_notificationBroadcaster.carNotification;

import javax.management.*;

public class Car implements CarMBean, NotificationBroadcaster {

    private String name;
    private NotificationBroadcasterSupport support = new NotificationBroadcasterSupport();
    private long sequenceNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        AttributeChangeNotification attributeChangeNotification = new AttributeChangeNotification(
                this, sequenceNumber++, System.currentTimeMillis(),
                "Hello Notification", "Name", String.class.getName(),this.name, name );
        support.sendNotification(attributeChangeNotification);
        this.name = name;
    }

    @Override
    public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws IllegalArgumentException {
        support.addNotificationListener(listener, filter, handback);
    }

    @Override
    public void removeNotificationListener(NotificationListener listener) throws ListenerNotFoundException {
        support.removeNotificationListener(listener);
    }

    @Override
    public MBeanNotificationInfo[] getNotificationInfo() {
        MBeanNotificationInfo beanNotificationInfo = new MBeanNotificationInfo(
                new String[]{Notification.class.getName()}, Notification.class.getName(), "default description");
        return new MBeanNotificationInfo[]{beanNotificationInfo};
    }
}
