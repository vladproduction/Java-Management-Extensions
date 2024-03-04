package com.vladproduction.sample3_notificationBroadcaster.distributedTask;

public class RemoteWorkerNode {

    private TaskCompletionNotification notificationBroadcaster = new TaskCompletionNotification();

    public void processTask(String taskId, Object taskData) {
        // Simulate task processing
        try {
            Thread.sleep(2000); // Delay for demo
            // Generate task result
            Object result = "Task " + taskId + " completed successfully!";
            notificationBroadcaster.sendNotification(taskId, result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public TaskCompletionNotification getNotificationBroadcaster() {
        return notificationBroadcaster;
    }
}
