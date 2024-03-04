package com.vladproduction.sample2_fireProperty.boundary;

public class Main {
    public static void main(String[] args) {

        MyCarListenerA listenerA = new MyCarListenerA();
        MyCarListenerB listenerB = new MyCarListenerB();

        MyCar myCar = new MyCar();
        myCar.addListener(listenerA); //connection to listener
        myCar.addListener(listenerB);
        myCar.setName("BMW");
        myCar.setName("BMW-X5");

        /*they are both work synchronous*/



    }
}
