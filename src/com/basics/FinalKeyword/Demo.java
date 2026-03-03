package com.basics.FinalKeyword;

public final class Demo {
    //class A extends Demo{
//
//}cannot be inherited
    class A{
        void show(){
            System.out.println("show some data:");
        }
    }
    class B extends A{
//    @Override//overriding not possible
//        void show(){
//        System.out.println("show some data");
//    }
    }
}
class c{
    final int x=200;
    //x=300;//cannot assign a value to a final variable
    void display(final int x){
        //x=10;//cannot assign a value to final parameter 'x'
    }
}