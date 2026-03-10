package com.advanced.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("laptop");
        cart.add("mouse");
        cart.add("fdw");
        cart.add("keyboard");
        System.out.println("latest old card " +cart);
        cart.remove("mouse");//case sentive
        System.out.println("latest cart " + cart);
        cart.set(2, "mechanical keyboard");
        System.out.println("latest cart after upadte " + cart);
    }
}