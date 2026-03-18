package com.advanced.dsa.dataStrutures.nonLinear.trees.problems.lca;

public class lca {
    static class Node{
        int data;
        Node left,right;//////////////
        Node(int data){
            this.data=data;
        }
    }
    static Node lowestcommonacenstor(Node root, int p, int q){
        if (root==null){

            return null;//rule 1a

        }
        if (root.data==p||root.data==q){
            return root;//rule 1b
        }
        Node left=lowestcommonacenstor(root.left,p,q);
        Node right=lowestcommonacenstor(root.right,p,q);
        if (left != null && right !=null){
            return root;//rule 2
        }
        return (left !=null ? left:right);//rule 3
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Node lca=lowestcommonacenstor(root,2,4);
        System.out.println("LCA " + lca.data);
    }
}