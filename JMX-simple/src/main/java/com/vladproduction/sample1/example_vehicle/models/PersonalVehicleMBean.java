package com.vladproduction.sample1.example_vehicle.models;

import com.vladproduction.sample1.example_vehicle.VehicleMBean;

public interface PersonalVehicleMBean extends VehicleMBean {

    void setOwnerName(String name);
    String getOwnerName();

}
