package com.vladproduction.sample1_mbeans.example_vehicle;

import com.vladproduction.sample1_mbeans.example_vehicle.models.Ambulance;
import com.vladproduction.sample1_mbeans.example_vehicle.models.PersonalVehicle;
import com.vladproduction.sample1_mbeans.example_vehicle.models.Police;
import com.vladproduction.sample1_mbeans.example_vehicle.models.Taxi;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;

public class Main03 {
    private static final MBeanServer server = MBeanServerFactory.createMBeanServer();

    public static void main(String[] args) throws Exception {

        Police.registerPolice(server);
        Ambulance.registerAmbulance(server);
        Taxi.registerTaxi(server);
        PersonalVehicle.registerPersonalVehicle(server);
    }

}
