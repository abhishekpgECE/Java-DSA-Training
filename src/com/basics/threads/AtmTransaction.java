package com.basics.threads;

public class AtmTransaction extends Thread {
    public void run(){
        System.out.println("processing trans");
    }

    public static void main(String[] args) {
        AtmTransaction tx=new AtmTransaction();
        System.out.println("Thread state before start " + tx.getState());// new-> object created
        tx.start();
        System.out.println("Thread state after start "+ tx.getState());//Runnable


    }

}
/*
code explaniation:
///Intially the Thread is in the new state.
///after calling start().it moves to RUNABLE state and
    it excetute the run () method.
/// the excute timming of state change will depend on the JVM scheluder
///////// points to remeber
// Thread is create only once
// start() change the state
// thread cannot be restored
//final state is dead or terminatee
//////a thread can be created by extending the thraed class and over ride
 */