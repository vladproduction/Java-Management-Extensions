package com.vladproduction.sample1_mbeans.example_vehicle.models;

import com.vladproduction.sample1_mbeans.example_vehicle.Vehicle;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import static com.vladproduction.sample1_mbeans.example_vehicle.TypeVehicle.PRIVATE_TYPE;

public class PersonalVehicle extends Vehicle implements PersonalVehicleMBean {

    private String ownerName;

    public static void registerPersonalVehicle(MBeanServer server) throws Exception {

        Vehicle personalVehicle = new PersonalVehicle();
        ObjectName keyPersonal = new ObjectName("private:vehicle=personal");
        server.registerMBean(personalVehicle, keyPersonal);

        AttributeList attributesPersonal = new AttributeList();
        attributesPersonal.add(new Attribute("TypeVehicle", PRIVATE_TYPE));
        attributesPersonal.add(new Attribute("Department", "car"));
        attributesPersonal.add(new Attribute("Model", "Kia"));
        attributesPersonal.add(new Attribute("EngineVolume", 2.5));
        attributesPersonal.add(new Attribute("RegisterNumber", 555111));
        attributesPersonal.add(new Attribute("IsAvailable", true));
        attributesPersonal.add(new Attribute("CommissioningYear", 2023));
        attributesPersonal.add(new Attribute("OwnerName", "John Dow"));

        server.setAttributes(keyPersonal, attributesPersonal);

        server.invoke(keyPersonal, "printInfo", new Object[0], new String[0]);
        server.invoke(keyPersonal, "workingYears", new Object[]{2024}, new String[]{"int"});

    }

    @Override
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }
}
