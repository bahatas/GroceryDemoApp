package com;

public class VehicleDemo {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(VehicleType.electric);
        System.out.println("motorcycle.toString() = " + motorcycle.toString());
        Car car = new Car(2, VehicleType.gas);
        System.out.println("car.toString() = " + car.toString());
        ElectricCar electricCar = new ElectricCar(2, VehicleType.electric);
        electricCar.runDiagnostics();
        electricCar.refuel();
        GasCar gasCar = new GasCar(2, VehicleType.gas);
        gasCar.changeOil();

    }
}
