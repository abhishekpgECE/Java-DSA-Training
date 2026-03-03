package com.basics.STRINGS;

public class StringConstantPool {
    public static void main(String[] args) {
        // they have literal value "java" so they point to the heap memory
        String s1="java";
        String s2="java";
        System.out.println(s1==s2);
        String s3= new String("java");
        System.out.println(s1==s3);//they are different object
        System.out.println(s1.equals(s3));//checking values
    }
}
