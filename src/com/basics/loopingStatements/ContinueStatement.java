package com.basics.loopingStatements;
public class ContinueStatement {
    // break statements end the loop and goes out of the loop
    // goes to the beginning of the loop for the next
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i + " ");
            }
        }
    }

