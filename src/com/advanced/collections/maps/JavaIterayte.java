package com.advanced.collections.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaIterayte {
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(4);
        number.add(67);
        number.add(89);
        System.out.println(number);
        number.removeIf(n->n>10);//shortcut mrthod

        Iterator<Integer>it=number.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println("after:"+ number);
    }
}