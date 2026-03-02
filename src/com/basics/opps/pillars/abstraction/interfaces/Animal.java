package com.basics.opps.pillars.abstraction.interfaces;

public interface Animal {
    //ℹ️ Interfaces have method with completely empty bodies
    //❌ Interfaces don't have normal methods
    //✅ So they exhibits 100% Abstraction
    //ℹ️ The methods are defined in Child class
    void run();
    void loves_to_eat();
}
class Rat implements Animal{
    @Override
    public void run() {
        System.out.println("Rats run fast.");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("Rats love to eat cheese.");
    }
}
class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Rats run fast.");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("Cats love to eat Rats.");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat= new Cat();
        cat.run();
        cat.loves_to_eat();
    }
}