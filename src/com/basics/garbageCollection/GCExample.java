package com.basics.GarbageCollection;

public class GCExample {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("python");
        s1=s2;

        //system.gc();//we wrote this in previous versions now it is not mandatory
        //now int the SCP->java is not available
        //this prove garbage collection is automatic
        System.out.println(s1);

    }
}