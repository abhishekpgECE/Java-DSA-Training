package com.basics.arrays.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,9};
        int n =arr.length+1;
        int totalSum=n*(n+1)/2;
        int arraysum=0;
        for(int num:arr){
            arraysum+=num;
        }
        System.out.println("array sum"+arraysum);
        int missingNumber=totalSum-arraysum;
        System.out.println("missingNumber"+missingNumber);

    }
}