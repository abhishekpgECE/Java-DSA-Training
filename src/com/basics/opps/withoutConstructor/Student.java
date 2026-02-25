package com.basics.opps.withoutConstructor;

public class Student {
    // instance Variables
    int USN;
    String name;
    int marks;
    void evaluatemarks(){
        if (marks<45){
            System.out.println(name+" has Failed");
        }else {
            System.out.println(name+" has Passed");
        }
    }
    public static void main(String[] args) {
        // object creation syntax: Classname obj = new Classname();
        Student s1=new Student();
        s1.USN=101;
        s1.name="Abhi";
        s1.marks=45;
        Student s2=new Student();
        s2.USN=101;
        s2.name="Deekshi";
        s2.marks=30;
        s1.evaluatemarks();
        s2.evaluatemarks();
    }
}
