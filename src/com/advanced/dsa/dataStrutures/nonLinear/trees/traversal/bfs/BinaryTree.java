package com.advanced.dsa.dataStrutures.nonLinear.trees.traversal.bfs;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTree {
    public static void  levelordertravesalorder(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        //level1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //level 2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        //level 3
        root.left.right.left=new TreeNode(9);
        root.right.right.left=new TreeNode(15);
        System.out.println("level order or Dfs");
        levelordertravesalorder(root);
    }
}