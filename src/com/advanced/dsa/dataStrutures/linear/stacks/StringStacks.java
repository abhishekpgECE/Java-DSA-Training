package com.advanced.dsa.dataStrutures.linear.stacks;

public class StringStacks {
    private static final int MAX_SIZE = 10;
    private  String[] arr = new String[MAX_SIZE];
    private int top = -1; // Initially the stack is empty
    public boolean isEmpty(){
        return  top == -1;
    }
    public boolean isFull(){
        return  top == MAX_SIZE -1;
    }
    public void push(String data){
        if (isFull()){
            System.out.println("Stack Overflow. Can't push more elements.");
            return;
        }
        arr[++top] = data; // Increment the top & add the elements at that index
        System.out.println("The String" + data + " was pushed to the stack. ");
    }
    public String pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow. Can't pop element");
            return null; // Because it's String So we return null
        }
        String popped = arr[top --];
        return popped;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Stack Underflow Can't Display Anything");
            return;
        }
        System.out.println("The Stack Elements From  Top to Bottom (LIFO): ");
        for (int i=top; i>0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public String peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow. No Top elements. ");
            return null;
        }
        return arr[top];
    }
    public int size(){
        // No elements, single element, multiple elements
        return top + 1; // One Formula For all Cases
    }

    public static void main(String[] args) {
        StringStacks stack = new StringStacks();
        // stack.pop();
        stack.push(" Milana ");
        stack.push(" Mungaru Male ");
        stack.push(" Galipata ");
        System.out.println(stack.peek());
        String popped = stack.pop();
        System.out.println("Popped " + popped);
        System.out.println("Size: " + stack.size());
    }
}
