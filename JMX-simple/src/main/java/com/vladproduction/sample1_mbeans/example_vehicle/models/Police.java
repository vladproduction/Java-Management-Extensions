package com.vladproduction.sample1_mbeans.example_vehicle.models;

import com.vladproduction.sample1_mbeans.example_vehicle.Vehicle;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import static com.vladproduction.sample1_mbeans.example_vehicle.TypeVehicle.SPECIAL_TYPE;


public class Police extends Vehicle {

    public static void registerPolice(MBeanServer server) throws Exception {

        Vehicle policeVehicle = new Vehicle();
        ObjectName keyPolice = new ObjectName("special:vehicle=police");
        server.registerMBean(policeVehicle, keyPolice);

        Attribute attrTypeVehicle = new Attribute("TypeVehicle", SPECIAL_TYPE);
        Attribute attrDepartment = new Attribute("Department", "police");
        Attribute attrModel = new Attribute("Model", "Mercedes");
        Attribute attrEngineVolume = new Attribute("EngineVolume", 3.2);
        Attribute attrRegisterNumber = new Attribute("RegisterNumber", 555);
        Attribute attrIsAvailable = new Attribute("IsAvailable", true);
        Attribute attrCommissioningYear = new Attribute("CommissioningYear", 2020);

        server.setAttribute(keyPolice, attrTypeVehicle);
        server.setAttribute(keyPolice, attrDepartment);
        server.setAttribute(keyPolice, attrModel);
        server.setAttribute(keyPolice, attrEngineVolume);
        server.setAttribute(keyPolice, attrRegisterNumber);
        server.setAttribute(keyPolice, attrIsAvailable);
        server.setAttribute(keyPolice, attrCommissioningYear);

        server.invoke(keyPolice, "printInfo", new Object[0], new String[0]);
        server.invoke(keyPolice, "workingYears", new Object[]{2024}, new String[]{"int"});

    }
}
