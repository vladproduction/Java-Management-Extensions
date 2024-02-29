package com.vladproduction.sample2.boundary;

public class Main {
    public static void main(String[] args) {

        MyCarListenerA listenerA = new MyCarListenerA();
        MyCarListenerB listenerB = new MyCarListenerB();

        MyCar myCar = new MyCar();
        myCar.add(listenerA); //connection to listener
        myCar.add(listenerB);
        myCar.setName("BMW");
        myCar.setName("BMW-X5");

        /*they are both work synchronous*/



    }
}
