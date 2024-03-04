package com.vladproduction.sample1_mbeans.example_vehicle.models;

import com.vladproduction.sample1_mbeans.example_vehicle.VehicleMBean;

public interface PersonalVehicleMBean extends VehicleMBean {

    void setOwnerName(String name);
    String getOwnerName();

}
