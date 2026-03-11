package com.basics.methods.recursion;

public class FibonacciSequence {
    public static int fibonnaic(int n){
        //base case
        if(n==0||n==1){
            return  n;
        }
        return fibonnaic(n-1)+fibonnaic(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonnaic(7));
    }
}