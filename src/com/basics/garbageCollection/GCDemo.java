package com.basics.GarbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj=new GCDemo();
        obj=null;
        System.gc();
        //nowadays GC() method is nautomatically called after program execution by the object class for clutter,garbage collection &removal by the JVM
        // ✅we dont need to call it explicitly
        System.out.println("gc requested!");
    }
}