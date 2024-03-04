package com.vladproduction.sample3_notificationBroadcaster.distributedTask;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class TaskCompletionNotification extends NotificationBroadcasterSupport {

    public static final String TYPE = "TaskCompleted";

    private long sequenceNumber;

    public void sendNotification(String taskId, Object result) {
        Notification notification = new Notification(TYPE, this, sequenceNumber++,
                System.currentTimeMillis(), taskId);
        notification.setUserData(result);
        sendNotification(notification);
    }
}
