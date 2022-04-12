package com;

public class GroceryDemo {


    public double calculateTotal(double price, int sold, double tax) {
        return (price * sold) * (1 + tax / 100);
    }

    public double calculateAverageSold(int mondaySold, int tuesdaySold, int wednesdaySold, int thursdaySold, int fridaySold) {
        double averageSold = (double) (mondaySold + tuesdaySold + wednesdaySold + thursdaySold + fridaySold) / 5;
        return java.lang.Math.floor(averageSold);
    }

    public double calculateProfit(double purchaseCost, double soldCost, int quantity) {
        return (soldCost - purchaseCost) * quantity;
    }
}
