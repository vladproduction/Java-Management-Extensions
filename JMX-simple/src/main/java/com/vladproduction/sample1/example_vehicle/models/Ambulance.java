package com.vladproduction.sample1.example_vehicle.models;

import com.vladproduction.sample1.example_vehicle.Vehicle;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import static com.vladproduction.sample1.example_vehicle.TypeVehicle.SPECIAL_TYPE;

public class Ambulance extends Vehicle {

    public static void registerAmbulance(MBeanServer server) throws Exception {

        Vehicle ambulance = new Vehicle(
                SPECIAL_TYPE, "ambulance", "WV", 2.5, 111, true, 2019);
        ObjectName keyAmbulance = new ObjectName("special:vehicle=ambulance");
        server.registerMBean(ambulance, keyAmbulance);

        server.invoke(keyAmbulance, "printInfo", new Object[0], new String[0]);
        server.invoke(keyAmbulance, "workingYears", new Object[]{2024}, new String[]{"int"});
    }
}
