package com.basics.STRINGS;

 public class DifferenceDemo {
    public static void main(String[] args) {
        String s="java";
        //hashcode-->unique id or number given by java
        System.out.println("string before:"+s.hashCode());
        s=s+ "dsa";//new object will be created
        System.out.println("string after:"+s.hashCode());//this proves that strings are immutable
//        for(int i=0;i<1000;i++){
//            s=s+"dsa";
//        }this is wrong as it is immutable it creates 1000 of new objects and heap memory use mutable string
        //StringBUffer&StringBuildwer-->java.lang
        StringBuilder builder=new StringBuilder("java");
        System.out.println("builder before:"+ builder.hashCode());
        builder.append("dsa");//add
        System.out.println("builder after:"+builder.hashCode());
    }

}
