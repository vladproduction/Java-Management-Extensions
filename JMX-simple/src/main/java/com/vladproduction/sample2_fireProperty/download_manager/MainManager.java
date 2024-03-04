package com.vladproduction.sample2_fireProperty.download_manager;

public class MainManager {
    public static void main(String[] args) {
        DownloadManager manager = new DownloadManager();
        DownloadProgressListener listener = new DownloadProgressListener();
        manager.addPropertyChangeListener(listener);
        manager.startDownload();
    }
}
