package com.basics.arrays.problems;

import java.util.Arrays;

// // Evan on the LHS & Odd on the RHS
public class ArrayPartitioning {
    public static void main(String[] args) {
        int[] arr = {3,8,5,1,27,6};
        System.out.println(Arrays.toString(arr));
        int l =0;
        int r =arr.length-1;
        while (l<r){
            if (arr[l] % 2==0){
                l++; // If even number are at correct place , Move Behind
            }
            if (arr[r] % 2 != 0){
                r--; // If even number are at correct place , Swap then
            }
            if (l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
