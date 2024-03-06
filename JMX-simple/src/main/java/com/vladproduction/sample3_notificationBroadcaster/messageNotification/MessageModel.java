package com.vladproduction.sample3_notificationBroadcaster.messageNotification;

import javax.management.*;

public class MessageModel implements MessageModelMBean, NotificationBroadcaster {

    private String msgText;
    private NotificationBroadcasterSupport support = new NotificationBroadcasterSupport();
    private long sequenceNumber;
    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        AttributeChangeNotification attributeChangeNotification = new AttributeChangeNotification(
                this, sequenceNumber++, System.currentTimeMillis(), "Notification status: send", "MsgText",
                String.class.getName(), this.msgText, msgText);
        support.sendNotification(attributeChangeNotification);
        this.msgText = msgText;
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
        MBeanNotificationInfo beanNotificationInfos = new MBeanNotificationInfo(
                new String[]{Notification.class.getName()}, Notification.class.getName(), "description text");
        return new MBeanNotificationInfo[]{beanNotificationInfos};
    }
}
