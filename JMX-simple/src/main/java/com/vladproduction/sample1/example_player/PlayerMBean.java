package com.vladproduction.sample1.example_player;

public interface PlayerMBean {

    void setName(String name);
    String getName();
    void setNumber(int number);
    int getNumber();
    void setIsRetire(boolean isRetire);
    boolean getIsRetire();
    String printInfo();
}
