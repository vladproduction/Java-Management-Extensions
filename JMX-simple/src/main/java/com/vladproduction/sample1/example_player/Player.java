package com.vladproduction.sample1.example_player;

public class Player implements PlayerMBean{

    private String name;
    private int number;
    private boolean isRetire = false;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;

    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void setIsRetire(boolean isRetire) {
        this.isRetire = isRetire;
    }

    @Override
    public boolean getIsRetire() {
        return this.isRetire;
    }

    @Override
    public String printInfo() {
        return "Name: " + this.name +
                "; #: " + this.number +
                "; Is retire: " + this.isRetire;
    }
}
