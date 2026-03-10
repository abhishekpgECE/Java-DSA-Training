package com.advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        //for adding elements[add][strict] [offer][leiniet]
        orders.add("order01");
        orders.offer("order02");
        orders.offer("orders03");
        System.out.println("oders" + orders);
        //for removing elements [remove] [poli]
        orders.remove();
        System.out.println("oders " + orders);
        orders.poll();
        System.out.println("oders " + orders);
    }
}