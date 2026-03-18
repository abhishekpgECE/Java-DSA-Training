package com.advanced.dsa.dataStrutures.nonLinear.trees.problems.diameter;

public class Node {
    int data;
    Node left;
    Node right;
    static int diameter=0;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public static int findHeight(Node root){
        if(root==null){
            return 0;//height of an empty tree is zero
        }
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        diameter=Math.max(diameter,leftHeight+rightHeight + 1);//include 1
        //diameter=Math.max(diameter,leftHeight+rightHeight );//exclude 1
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        root.right.right.right=new Node(5);
        System.out.println("height: "+findHeight(root));
        System.out.println("diameter " + diameter );
        System.out.println("diameter2 " + diameter);
    }
}