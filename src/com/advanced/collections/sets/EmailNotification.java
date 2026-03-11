package com.advanced.collections.sets;

import java.util.HashSet;
import java.util.TreeSet;

public class EmailNotification {
    public static void main(String[] args) {
        HashSet<String> emailQueue=new HashSet<>();
        emailQueue.add("@gmail.com1");
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@g.com");
        System.out.println("size"+ emailQueue);
    }
}