package com.basics.arrays.problems;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr={2,2,3,4,5};
        int target=9;
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indics   "+i+" "+j);
                    System.out.println("values  "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}