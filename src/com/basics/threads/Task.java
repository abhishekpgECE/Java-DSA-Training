package com.basics.threads;

public class Task extends Thread{
    public  void run() {
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println("this child task or thread has finished");
    }

    public static void main(String[] args) {
        Task t=new Task();
        t.start();// Guartened wait to finish the child thread
        System.out.println("costumer has stared eating");

    }
}