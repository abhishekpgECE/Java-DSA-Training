package com.basics.opps.pillars.abstraction.interfaces;

public interface Demo {
    void display();
}
class main{
    public static void main(String[] args) {
        Demo obj=new Demo() {
            public void display() {
                System.out.println("normal code- biolerplate code");
            }
        };
        obj.display();
        //SCALA - JAVA- 8 ; lambda expression->linear
        Demo obj1=()-> System.out.println("Scalar code");
        obj.display();
    }
}