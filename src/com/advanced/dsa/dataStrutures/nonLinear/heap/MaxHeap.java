package com.advanced.dsa.dataStrutures.nonLinear.heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> Maxheap= new PriorityQueue<>(Collections.reverseOrder());
        Maxheap.add(8);
        Maxheap.add(6);
        Maxheap.add(2);
        Maxheap.add(1);
        Maxheap.add(9);
        Maxheap.add(7);
        Maxheap.add(5);
        System.out.println(Maxheap);
        System.out.println(Maxheap.poll());
        System.out.println(Maxheap.poll());
    }
}