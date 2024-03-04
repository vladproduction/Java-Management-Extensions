package com.vladproduction.sample2_fireProperty.settings_example;

public class Main {
    public static void main(String[] args) {

        Settings settings = new Settings();
        ListenerA listenerA = new ListenerA();
        ListenerB listenerB = new ListenerB();
        ListenerC listenerC = new ListenerC();

        settings.addListener(listenerA);
        settings.addListener(listenerB);
        settings.addListener(listenerC);

        settings.setLanguage("fr");
        settings.setThemeColor("Dark");
        settings.setNotificationEnabled(false);


    }
}
