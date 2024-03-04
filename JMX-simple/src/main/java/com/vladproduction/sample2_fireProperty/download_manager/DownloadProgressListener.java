package com.vladproduction.sample2_fireProperty.download_manager;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DownloadProgressListener implements PropertyChangeListener {

    private final DownloadManager manager = new DownloadManager();

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("downloadedBytes")) {
            int downloadedBytes = (int) evt.getNewValue();
            int totalBytes = manager.getTotalBytes();
            int progress = (downloadedBytes * 100) / totalBytes;

            System.out.println("Download progress: " + progress + "%");
        } else if (evt.getPropertyName().equals("downloadStatus")) {
            System.out.println("Download status: " + evt.getNewValue());
        }
    }
}
