package com.vladproduction.sample2.boundary;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyCarListenerA implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("start: My Car Listener A".toUpperCase());
        String propertyName = evt.getPropertyName();
        Object oldValue = evt.getOldValue();
        Object newValue = evt.getNewValue();
        System.out.println("propertyName = " + propertyName);
        System.out.println("oldValue = " + oldValue);
        System.out.println("newValue = " + newValue);
        System.out.println("end: My Car Listener A".toUpperCase());
    }
}
