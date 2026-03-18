package com.advanced.dsa.dataStrutures.nonLinear.trees.traversal.dfs;

public class Node {
    int data; //data of the node
    Node left; //address of the left child
    Node right; // address of the right child
    Node(int data){
        this.data = data;
        this.left = this.right = null; //Node has no children initially
    }
    public static void preorder(Node root){//DLR
        if (root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    }
    public static void inorder(Node root){ //LDR
        if (root != null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }

    }
    public static void postorder(Node root){ //LRD
        if (root !=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

    }

    public static void main(String[] args) {

        //construct binary tree
        //we must construct tree from top to bottom and left to right
        //level --0
        Node root = new Node(1);
        //level -- 1
        root.left = new Node(2);
        root.right = new Node(3);
        // level 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        //level 3
        root.left.right.left = new Node(9);
        root.right.right.left = new Node(15);
        System.out.println(" PreOrder Traversal ");
        preorder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inorder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        postorder(root);
        System.out.println();

    }
}