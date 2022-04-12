package com;

import java.util.List;

public class ItemDemo {
    public static void main(String[] args) {

        System.out.println();
    }

    public String getMostExpensiveItem(ItemSale itemSale1, ItemSale itemSale2, ItemSale itemSale3) {
        String mostExpensiveItemName = "";
        if (itemSale1.purchasePrice >= itemSale2.purchasePrice && itemSale1.purchasePrice >= itemSale3.purchasePrice) {
            mostExpensiveItemName = itemSale1.itemName;
        } else if (itemSale2.purchasePrice >= itemSale3.purchasePrice && itemSale2.purchasePrice >= itemSale1.purchasePrice) {
            mostExpensiveItemName = itemSale2.itemName;
        } else {
            mostExpensiveItemName = itemSale3.itemName;
        }
        return mostExpensiveItemName;
    }

    public String getLargestProfitItem(ItemSale itemSale1, ItemSale itemSale2, ItemSale itemSale3) {
        double item1Profit = (itemSale1.sellPrice - itemSale1.purchasePrice) * itemSale1.itemsSold;
        double item2Profit = (itemSale2.sellPrice - itemSale2.purchasePrice) * itemSale2.itemsSold;
        double item3Profit = (itemSale3.sellPrice - itemSale3.purchasePrice) * itemSale3.itemsSold;

        if (item1Profit >= item2Profit && item1Profit >= item3Profit) {
            return itemSale1.itemName;
        } else if (item2Profit >= item3Profit && item2Profit >= item3Profit) {
            return itemSale2.itemName;
        }else{
            return itemSale3.itemName;
        }
    }

    public double getProfit(String nameOfItem, ItemSale itemSale1, ItemSale itemSale2, ItemSale itemSale3) {
        ItemSale itemSale=null;
        if (itemSale1.itemName.equals(nameOfItem)) {
            itemSale = itemSale1;
        }
        if (itemSale2.itemName.equals(nameOfItem)) {
            itemSale = itemSale2;
        }
        if (itemSale3.itemName.equals(nameOfItem)) {
            itemSale = itemSale3;
        } else {
            return 0;//?
        }
        return new GroceryDemo().calculateProfit(itemSale.purchasePrice, itemSale.sellPrice, itemSale.itemsSold);
    }

    public String getMostExpensiveItem(List<ItemSale> itemsales) {
        double price = 0;
        String mostExpensiveItemName = "";

        for (ItemSale itemsale : itemsales) {
            if(itemsale.sellPrice>price){
               mostExpensiveItemName = itemsale.itemName;
               price=itemsale.sellPrice;
            }
        }
        return mostExpensiveItemName;
    }

    public String getLargestProfitItem(List<ItemSale> itemsales) {
        double largestProfitNumber=Integer.MIN_VALUE;
        String mostProfitItemName = "";
        for (ItemSale itemsale1 : itemsales) {
            double itemProfit = (itemsale1.sellPrice - itemsale1.purchasePrice) * itemsale1.itemsSold;
            if(itemProfit>largestProfitNumber){
                mostProfitItemName = itemsale1.itemName;
                largestProfitNumber=itemProfit;
            }
        }
        return mostProfitItemName;
    }

    public double getProfit(String nameOfItem, List<ItemSale> itemsales) throws Exception {
        for (ItemSale itemsale : itemsales) {
            if(itemsale.itemName.equals(nameOfItem)){
                return new GroceryDemo().calculateProfit(itemsale.purchasePrice, itemsale.sellPrice, itemsale.itemsSold);
            }
        }
        throw new Exception(nameOfItem + " is not in the list");
    }
}
