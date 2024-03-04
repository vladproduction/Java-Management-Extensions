package com.vladproduction.sample2_fireProperty.download_manager;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DownloadManager {

    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private int downloadedBytes = 0;
    private final int totalBytes = 1000;
    private String downloadStatus = "Not Started";

    public int getDownloadedBytes() {
        return downloadedBytes;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public String getDownloadStatus() {
        return downloadStatus;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        support.removePropertyChangeListener(listener);
    }

    //simulation download process
    public void startDownload(){
        for (int i = 0; i < totalBytes; i++) {
            downloadedBytes++;
            try {
                Thread.sleep(3); //some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            support.firePropertyChange("downloadedBytes", null, downloadedBytes);
            if(downloadedBytes == totalBytes){
                downloadStatus = "Downloading complete!";
                support.firePropertyChange("downloadStatus", null, downloadStatus);
            }
        }
    }


}
