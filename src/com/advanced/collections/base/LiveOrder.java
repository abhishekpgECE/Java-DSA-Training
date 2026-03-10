package com.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrder {
    public static void main(String[] args) {
        Collection<String> liveorder=new ArrayList<>();
        liveorder.add("oders12");
        liveorder.add("oders232");
        liveorder.add("oders345");
        //check order
        System.out.println("oders12 is avabile "+ liveorder.contains("oders12"));
        System.out.println("live orders "+ liveorder);
        liveorder.remove("oders12");
        System.out.println("oders12 is avabile "+ liveorder.contains("oders12"));
        System.out.println("live orders "+ liveorder);
        System.out.println("total live oders "+ liveorder.size());
        liveorder.clear();
        System.out.println("current orders "+ liveorder);

    }
}