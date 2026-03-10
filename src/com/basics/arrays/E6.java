package com.basics.arrays;

import java.util.Arrays;

public class E6 {
    public static void main(String[] args){
        //some methods array methods
        int[] arr = {100,200,300,400,500};
        //converts the content into a String and print them in to line
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length];//00000
        System.out.println(Arrays.toString(arr2));
        //copy the content of 1st array to 2nd array
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i];//dest[i] = src[i]
        }
        System.out.println(Arrays.toString(arr2));
        //method 2 -> using arraycopy(5 argements)
        int[] arr3 = new int[arr2.length];//000000
        //src; srcPos; dest; length
        System.arraycopy(arr2,0, arr3,0,arr2.length);
        System.out.println(Arrays.toString(arr3));
        //method3 -> by using clone() method
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}