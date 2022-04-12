package com;

public class ElectricCar extends Car implements ElectricEngine,Engine{


    public ElectricCar(int numberOfPassengers, VehicleType vehicleType) {
        super(numberOfPassengers, vehicleType);
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Engine is in good health.");
    }

    @Override
    public void refuel() {
        System.out.println("refueling with electricity");
    }
}
