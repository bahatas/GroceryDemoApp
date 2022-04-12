package com;

public class Car extends Vehicle {
    public Car(int numberOfPassengers, VehicleType vehicleType) {
        super("car", numberOfPassengers, vehicleType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
