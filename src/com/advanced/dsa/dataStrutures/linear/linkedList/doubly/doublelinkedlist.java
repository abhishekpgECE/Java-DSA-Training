package com.advanced.dsa.dataStrutures.linear.linkedList.doubly;

import java.util.Scanner;

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
    }
}
public class doublelinkedlist {
    static DNode head=null;//this means list is empty
    static void insert(int data){
        DNode newNode=new DNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        DNode temp=head;
        while(temp.next !=null){
            temp= temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp.next;
    }
    static void display(){
        DNode temp= head;
        System.out.println("null ->");
        while(temp != null){
            System.out.println(temp.data + " <->");
            temp= temp.next;
        }
        System.out.println("null");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the"+ n+ "nodes");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        display();
    }
}