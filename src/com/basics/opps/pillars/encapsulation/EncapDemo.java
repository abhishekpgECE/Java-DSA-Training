package com.basics.opps.pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // setters
        e1.setId(101);
        e1.setEmail("abhi@gmail.com");
        System.out.println(e1.getid());
        System.out.println(e1.getEmailid());
    }
}
