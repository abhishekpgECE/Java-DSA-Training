package com.advanced.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,45,6,7,5,5,8,9};
        System.out.println(Arrays.toString(arr));
        Set<Integer> uniqueelement = new HashSet<>();
        for(int x:arr){
            uniqueelement.add(x);
        }
        System.out.println("Unique elemnt: "+uniqueelement);
        Set<Integer> nonDuplicate=new HashSet<>();
        nonDuplicate.addAll(Arrays.asList(1,1,2,3,4,45,6,7,5,5,8,9));
        System.out.println(nonDuplicate);
    }
}