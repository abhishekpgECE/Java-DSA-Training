package com.basics.threads;
public class DeadlockDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread 1 Locked Account A");
                try {
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB) {
                    System.out.println("Thread 1 Locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread 2 Locked Account B");
                try {
                    Thread.sleep(3000);
                }catch (Exception e){}
                synchronized (accountA) {
                    System.out.println("Thread 2 Locked Account A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/*
Points to remember
Thread 1 acquires a lock on accountA and then sleeps,giving
Thread 2 time to acquire a lock on AccountB;
thread 1 waits for Account A& Thread 2 waits for accountB
Since neither thread releases the lock,both keep waiting for each other creating a Deadlock❌ Situation
✅Deadlock Explanation:Deadlock occurs when each thread is holding
a resource and waiting for the other thread to release it.
➡️When deadlock occurs ,it will not destroy the app,it will freeze it premanently.
🟢How to reslove deadlock->Write a better code!!!0
 */