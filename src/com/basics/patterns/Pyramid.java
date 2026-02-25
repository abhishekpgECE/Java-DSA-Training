package com.basics.patterns;

public class Pyramid {
    public static void main(String[] args) {
        pyramid(5);
    }
    static void pyramid(int n){
        for (int i=1; i<=n; i++){
            // spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            //stars
            for (int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
