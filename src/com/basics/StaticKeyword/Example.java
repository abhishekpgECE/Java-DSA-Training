package com.basics.StaticKeyword;

public class Example {
    //static belongs to the stack memory
    static int x=2;
    static {
        System.out.println("open the system");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU+ECE+EEE+2027");
        System.out.println(x);
    }
    static {
        System.out.println("START APP");
        System.out.println("internet start like that etc");
    }
}//first static inorder than the main is executed