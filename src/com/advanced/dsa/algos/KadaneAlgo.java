package com.advanced.dsa.algos;

public class KadaneAlgo {
    static int kadanealgo(int[] arr){
        int gMax=arr[0];
        int cMax=arr[0];
        for(int i=1;i< arr.length;i++){
            cMax=Math.max(arr[i],cMax + arr[i]);
            gMax=Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] arr={5,-8,1,2,4,6};
        System.out.println("Maximum sub Arry sum " + kadanealgo(arr));
        int[] data={-1,-2,-3,-4,-6,0};
        System.out.println("Max " +  kadanealgo(data));
    }
}