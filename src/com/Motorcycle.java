package com;

public class Motorcycle extends Vehicle {
    public Motorcycle(VehicleType vehicleType) {
        super("motorcycle", 1, vehicleType);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
