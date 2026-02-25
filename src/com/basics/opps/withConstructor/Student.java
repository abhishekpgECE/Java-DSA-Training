package com.basics.opps.withConstructor;

public class Student {
    // instance Variables
    int USN;
    String name;
    int marks;
    Student(int USN, String name, int marks){
        this.USN=USN;
        this.name=name;
        this.marks=marks;
    }
    void evaluatemarks(){
        if (marks<45){
            System.out.println(name+" has Failed");
        }else {
            System.out.println(name+" has Passed");
        }
    }
    public static void main(String[] args) {
        // object creation syntax: Classname obj = new Classname();
        Student s1=new Student(101,"Abhi",99);
        Student s2=new Student(102,"Deekshi",100);
        s1.evaluatemarks();
        s2.evaluatemarks();
    }
}
