package com.basics.STRINGS;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuilder builder=new StringBuilder("java");
        for (int i=0;i<100000000;i++){
            builder.append("dsa");
        }
        System.out.println("builder time:"+(System.currentTimeMillis()-startTime)+"ms");
        startTime=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("java");
        for (int i=0;i<100000000;i++){
            buffer.append("dsa");
        }
        System.out.println("buffer time:"+(System.currentTimeMillis()-startTime)+"ms");
    }
}