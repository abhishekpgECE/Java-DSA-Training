package com.basics.opps.thisKeywordExample;

public class Demo {
    // Instance variable
    String i;
    void change(String i){
        this.i=i;
    }
    void display(){
        System.out.println("The value of i is:"+i);
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.change("Demo");
        obj.display();
    }
}
