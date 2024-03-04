package com.vladproduction.sample1.example_vehicle;

public class Vehicle implements VehicleMBean{

    private TypeVehicle typeVehicle;
    private String department;
    private String model;
    private double engineVolume;
    private int registerNumber;
    private boolean isAvailable;
    private int commissioningYear;

    public Vehicle(
            TypeVehicle typeVehicle, String department, String model, double engineVolume,
            int registerNumber, boolean isAvailable, int commissioningYear) {
        this.typeVehicle = typeVehicle;
        this.department = department;
        this.model = model;
        this.engineVolume = engineVolume;
        this.registerNumber = registerNumber;
        this.isAvailable = isAvailable;
        this.commissioningYear = commissioningYear;
    }

    public Vehicle() {
    }

    @Override
    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    @Override
    public TypeVehicle getTypeVehicle() {
        return this.typeVehicle;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return this.department;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public double getEngineVolume() {
        return this.engineVolume;
    }

    @Override
    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public int getRegisterNumber() {
        return this.registerNumber;
    }

    @Override
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Override
    public void setCommissioningYear(int commissioningYear) {
        this.commissioningYear = commissioningYear;
    }

    @Override
    public int getCommissioningYear() {
        return this.commissioningYear;
    }

    @Override
    public void printInfo() {
        System.out.println("Vehicle{" +
                "typeVehicle=" + this.typeVehicle +
                ", department='" + this.department + '\'' +
                ", model='" + this.model + '\'' +
                ", engineVolume=" + this.engineVolume +
                ", registerNumber=" + this.registerNumber +
                ", isAvailable=" + this.isAvailable +
                ", commissioningYear=" + this.commissioningYear +
                '}');
    }
    @Override
    public void workingYears(int currentYear){
        System.out.println("years in use: " + (currentYear - this.commissioningYear));
    }
}

