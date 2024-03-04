package com.vladproduction.sample2_fireProperty.settings_example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Settings {

    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private String language = "en";
    private String themeColor = "Light";
    private boolean notificationEnabled = true;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        String oldValue = this.language;
        this.language = language;
        support.firePropertyChange("language", oldValue, language);
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        String oldValue = this.themeColor;
        this.themeColor = themeColor;
        support.firePropertyChange("themeColor", oldValue, themeColor);
    }

    public boolean isNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(boolean notificationEnabled) {
        boolean oldValue = this.notificationEnabled;
        this.notificationEnabled = notificationEnabled;
        support.firePropertyChange("notificationEnabled", oldValue, notificationEnabled);
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
