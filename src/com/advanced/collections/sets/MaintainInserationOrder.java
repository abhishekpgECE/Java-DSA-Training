package com.advanced.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInserationOrder {
    public static void main(String[] args) {
        HashSet<Integer> set=new LinkedHashSet<>();
        set.add(34);
        set.add(67);
        set.add(78);
        set.add(56);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}