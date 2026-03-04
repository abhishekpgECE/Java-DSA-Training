package com.basics.threads;

public class FestRegistration {
    //form fill
    static  class formfill extends Thread{
        public void run(){
            System.out.println("filling the form");
        }

    }
    //upload document
    static  class documentupload extends Thread {
        public void run() {
            System.out.println("filling the document");
            //email notification
        }
    }
    static  class email extends Thread {
        public void run() {
            System.out.println("filling the email");
        }
    }

    public static void main(String[] args) {
        formfill t1= new formfill();
        documentupload t2=new documentupload();
        email t3=new email();
        t1.start();
        t2.start();
        t3.start();
    }}
/*
points to remeber
java program stars with one main thread
threads allow parallel
threads share memory
when start() is called the jvm created a new thread
when run() is called directly there is no concurrency
//// process vs thread
process is running a program
thread is a path of execuation
threads share the same memory
creating a thread is cheaper than creating a process
////////examples
process-> google chrome browser
thread -> opening a new tab in chrome
 */