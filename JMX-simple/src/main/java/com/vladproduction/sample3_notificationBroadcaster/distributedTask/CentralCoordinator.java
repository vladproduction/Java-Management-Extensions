package com.vladproduction.sample3_notificationBroadcaster.distributedTask;

import javax.management.Notification;
import javax.management.NotificationListener;

public class CentralCoordinator implements NotificationListener {

    @Override
    public void handleNotification(Notification notification, Object handback) {
        if (notification.getType().equals(TaskCompletionNotification.TYPE)) {
            String taskId = notification.getMessage();
            Object result = notification.getUserData();
            System.out.println("Task completed: " + taskId + ", Result: " + result);
            // Perform any actions based on task completion and result
        }
    }
}
