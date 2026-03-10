package com.basics.arrays.problems;

import java.util.Arrays;

class MaxElementAndMinElement {
    public static void main(String[] args) {
        int[] array={23,675,765,545,904,455,-23456};
        int mx=array[0];//we assume the first to be max
        int mn=array[0];//we assume that the first is min
        for(int i=1;i<array.length;i++){
            if(array[i]>mx){
                mx=array[i];
            }
            if(array[i]<mn){
                mn=array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(" The max value "+ mx);
        System.out.println(" the min value "+ mn);
    }
}