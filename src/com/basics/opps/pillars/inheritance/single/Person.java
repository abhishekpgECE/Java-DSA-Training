package com.basics.opps.pillars.inheritance.single;

public class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
class Student extends Person{
    int rollNo;
    Student(int rollNo, String name){
        super(name);
        this.rollNo=rollNo;
    }
    void display(){
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        Student student = new Student(100, "Abhi");
        student.display();
    }
}
