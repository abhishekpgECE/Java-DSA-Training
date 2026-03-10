package com.basics.arrays;

import java.util.Arrays;

public class E4 {
    public static void main(String[] args) {
        int[][]number={{1,2,4,5},{4,6,4},{4,5,},{9}};
        for (int[] x:number){
            for(int n:x){
                System.out.print(n+ " ");
            }
        }
        System.out.println();
        char[][] names={{'s','i','m','o','n'},
                {'f','a','h','a','d'},
                {'p','u','t','i','n'},
                {'h','a','p','p','y'},
                {'m','a','n','u','w','e','d','s','e','v','i','t','a'}};
        for (char [] ch:names){
            for(char c:ch){
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
}