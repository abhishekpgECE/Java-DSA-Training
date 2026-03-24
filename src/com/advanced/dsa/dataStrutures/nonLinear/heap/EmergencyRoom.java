package com.advanced.dsa.dataStrutures.nonLinear.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> serverity=new PriorityQueue<>();
        //1-> High Priority
        //2->low Priority
        //3-> Medium Priority
        //Patients with higher priority should be operated first
        serverity.offer(5);
        serverity.offer(3);
        serverity.offer(7);
        serverity.offer(1);
        System.out.println(" patient to operate first ->" + serverity.poll());
        System.out.println("patient in queue ->" + serverity);
    }
}