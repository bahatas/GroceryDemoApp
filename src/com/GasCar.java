package com;

public class GasCar extends Car implements GasEngine{


    public GasCar(int numberOfPassengers, VehicleType vehicleType) {
        super(numberOfPassengers, vehicleType);
    }

    @Override
    public void changeOil() {

        System.out.println("Changing oil.");
    }
}
