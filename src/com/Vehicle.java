package com;

public abstract class Vehicle {
    String name;
    int numberOfPassengers;
    VehicleType vehicleType;

    public Vehicle(String name, int numberOfPassengers, VehicleType vehicleType) {
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
