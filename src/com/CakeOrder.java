package com;

public class CakeOrder {
    int orderId;
    Size size;
    String costumerName;
    double cost;

    public CakeOrder(int orderId, Size size, String costumerName, double cost) {
        this.orderId = orderId;
        this.size = size;
        this.costumerName = costumerName;
        this.cost = cost;
    }



    public int getOrderId() {
        return orderId;
    }

    public Size getSize() {
        return size;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public double getCost() {
        return cost;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CakeOrder{" +
                "orderId=" + orderId +
                ", size=" + size +
                ", costumerName='" + costumerName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
