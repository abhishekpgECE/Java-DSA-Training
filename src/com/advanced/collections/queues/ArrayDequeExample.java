package com.advanced.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("user type A");
        actions.addLast("user type B");
        actions.addLast("user type C");
        System.out.println("intial action " + actions);
        System.out.println("under action " + actions.removeLast());
        System.out.println("remaing Action " + actions);
    }
}