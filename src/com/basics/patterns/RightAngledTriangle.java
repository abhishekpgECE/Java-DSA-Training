package com.basics.patterns;

public class RightAngledTriangle {
    static void right_angled_Triangle(int n){
        for (int r=1; r<=n;r++ ){
            for (int c=1; c<=r;c++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        right_angled_Triangle(5);
        right_angled_Triangle1(5);
    }
    static void right_angled_Triangle1(int n){
        for (int r=1; r<=n;r++ ){
            for (int c=1; c<=r;c++ ){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
