package com.vladproduction.sample1_mbeans.example_vehicle.models;

import com.vladproduction.sample1_mbeans.example_vehicle.Vehicle;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import static com.vladproduction.sample1_mbeans.example_vehicle.TypeVehicle.PUBLIC_TYPE;


public class Taxi extends Vehicle {

    public static void registerTaxi(MBeanServer server) throws Exception {

        Vehicle taxiVehicle = new Taxi();
        ObjectName keyTaxi = new ObjectName("public:vehicle=taxi");
        server.registerMBean(taxiVehicle, keyTaxi);

        AttributeList attributesTaxi = new AttributeList();
        attributesTaxi.add(new Attribute("TypeVehicle", PUBLIC_TYPE));
        attributesTaxi.add(new Attribute("Department", "taxi"));
        attributesTaxi.add(new Attribute("Model", "Skoda"));
        attributesTaxi.add(new Attribute("EngineVolume", 2.0));
        attributesTaxi.add(new Attribute("RegisterNumber", 223344));
        attributesTaxi.add(new Attribute("IsAvailable", true));
        attributesTaxi.add(new Attribute("CommissioningYear", 2018));

        server.setAttributes(keyTaxi, attributesTaxi);

        server.invoke(keyTaxi, "printInfo", new Object[0], new String[0]);
        server.invoke(keyTaxi, "workingYears", new Object[]{2024}, new String[]{"int"});

    }
}
