package com.basics.opps.pillars.inheritance.single;

public class Animal { // Parent class // Super class
    void eat(){
        System.out.println("Animal eats some food!");
    }
}
class Cat extends Animal{ // Child class // Sub class
    void run(){
        System.out.println("Cat run very fast.");
    }

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.run();
        cat.eat();
    }
}
