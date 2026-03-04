package com.basics.Exceptions;

public class E4 {
    static void withdraw(int tb, int amt) {
        final int mb = 2000;
        if (tb - amt < mb) {
            throw new RuntimeException("mininimum balance is 2000");//6000-3000=3000

        }
        System.out.println("withdrawal successful");
        System.out.println("remaining balance" + (tb - amt));
    }

    public static void main(String[] args) {
        withdraw(6000,3000);
        withdraw(6000,5000);
    }
}