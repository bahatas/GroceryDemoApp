package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CakeOrderDemo {

    public static void main(String[] args) {


        CakeOrder[] cakeOrders = new CakeOrder[3];
        cakeOrders[0]=new CakeOrder(1, Size.LARGE,"name1",1.0);
        cakeOrders[1]=new CakeOrder(2, Size.MEDIUM,"name2",2.0);
        cakeOrders[2]=new CakeOrder(3, Size.LARGE,"name3",3.0);

        System.out.println("Arrays.toString(getAllCakeOrdersForSize(cakeOrders,Size.LARGE)) = "
                + Arrays.toString(getAllCakeOrdersForSize(cakeOrders, Size.LARGE)));

        System.out.println("Arrays.toString(getCakeOrdersOver(cakeOrders,1)) = "
                + Arrays.toString(getCakeOrdersOver(cakeOrders, 1)));

        CakeOrder cakeOrder4 = new CakeOrder(4, Size.LARGE,"name4",4.0);
        changeCakeSizeAndPrice(cakeOrder4,Size.SMALL,2.0); //void
    }

    /**
     *
     * @param cakeOrders
     * @param size
     * @return
     */
    static CakeOrder[] getAllCakeOrdersForSize(CakeOrder[] cakeOrders, Size size){
        List<CakeOrder> cakeOrderList = new ArrayList<>();
        for(CakeOrder cakeOrder: cakeOrders){
            if(cakeOrder.size==size){
                cakeOrderList.add(cakeOrder);
            }
        }
        return cakeOrderList.toArray(new CakeOrder[0]);
    }

    /**
     *
     * @param cakeOrders
     * @param price
     * @return
     */
    static CakeOrder[] getCakeOrdersOver(CakeOrder[] cakeOrders, double price){
        List<CakeOrder> cakeOrderList = new ArrayList<>();
        for(CakeOrder cake: cakeOrders){
            if(cake.getCost()>price){
                cakeOrderList.add(cake);
            }
        }
        return cakeOrderList.toArray(new CakeOrder[0]);
    }

    /**
     *
     * @param cakeOrder
     * @param size
     * @param price
     */
    static void changeCakeSizeAndPrice(CakeOrder cakeOrder, Size size, double price){
      cakeOrder.size=size;
      cakeOrder.cost=price;
    }

    /**
     *
     * @param cakeOrders
     * @param size
     * @return
     */
    static List<CakeOrder> getAllCakeOrdersForSize(List<CakeOrder>  cakeOrders, Size size){
        for(CakeOrder cakeOrder: cakeOrders){
            if(cakeOrder.size!=size){
                cakeOrders.remove(cakeOrder);
            }
        }
        return cakeOrders;
    }

    /**
     *
     * @param cakeOrders
     * @param price
     * @return
     */
    static List<CakeOrder> getCakeOrdersOver(List<CakeOrder> cakeOrders, double price){
        for(CakeOrder cake: cakeOrders){
            if(cake.getCost()<=price){
                cakeOrders.remove(cake);
            }
        }
        return cakeOrders;
    }
}
