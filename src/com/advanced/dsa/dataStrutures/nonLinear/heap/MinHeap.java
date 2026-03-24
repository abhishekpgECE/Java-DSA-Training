package com.advanced.dsa.dataStrutures.nonLinear.heap;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(9);
        minHeap.add(7);
        minHeap.add(5);
        System.out.println(minHeap);
    }
}