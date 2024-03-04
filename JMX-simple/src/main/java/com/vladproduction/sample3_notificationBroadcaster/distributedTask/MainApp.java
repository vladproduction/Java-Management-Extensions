package com.vladproduction.sample3_notificationBroadcaster.distributedTask;

public class MainApp {
    public static void main(String[] args) {

        // Create a remote worker node
        RemoteWorkerNode worker = new RemoteWorkerNode();

// Create a central coordinator
        CentralCoordinator coordinator = new CentralCoordinator();
        worker.getNotificationBroadcaster().addNotificationListener(coordinator, null, null);

// Simulate task submission
        worker.processTask("Task1", "Some task data");

    }
}
