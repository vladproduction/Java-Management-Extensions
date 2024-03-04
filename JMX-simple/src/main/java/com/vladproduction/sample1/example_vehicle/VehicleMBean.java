package com.vladproduction.sample1.example_vehicle;

public interface VehicleMBean {

    //like getters and setters:
    void setTypeVehicle(TypeVehicle typeVehicle);
    TypeVehicle getTypeVehicle();
    void setDepartment(String department);
    String getDepartment();
    void setModel(String model);
    String getModel();
    void setEngineVolume(double engineVolume);
    double getEngineVolume();
    void setRegisterNumber(int registerNumber);
    int getRegisterNumber();
    void setIsAvailable(boolean isAvailable);
    boolean getIsAvailable();
    void setCommissioningYear(int commissioningYear);
    int getCommissioningYear();

    //service methods:
    void printInfo();
    void workingYears(int currentYear);
}
