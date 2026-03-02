package com.basics.opps.pillars.abstraction.abstractClasses;
abstract class Vehicle {
    // ℹ️Two types of methods:
    //1. Normal or Concrete
    void vehicle_type(){
        System.out.println("Two wheeler or Four wheeler.");
    }
    //2. Abstract Method
    abstract void start();
    // This Abstract method will be defined in the child class
    // If there are only abstract methods - 100% abstraction
    // If there is even 1 normal method - not 100% abstraction
}
class Meteor350 extends Vehicle{

    @Override
    void start() {
        System.out.println("Meteor350 starts with Self.");
    }
}
class TataHexa extends Vehicle{

    @Override
    void start() {
        System.out.println("Hexa starts with Key.");
    }
}
class Demo{
    public static void main(String[] args) {
        Meteor350 bike = new Meteor350();
        TataHexa car = new TataHexa();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}