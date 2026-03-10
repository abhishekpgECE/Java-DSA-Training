package com.advanced.collections.lists;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        int top=stack.pop();
        System.out.println(top);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}