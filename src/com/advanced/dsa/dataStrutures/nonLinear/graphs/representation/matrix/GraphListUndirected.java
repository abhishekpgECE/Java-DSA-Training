package com.advanced.dsa.dataStrutures.nonLinear.graphs.representation.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n-> number of nodes
        // m -> number of edges
        // we cover all the n nodes to get the matrix
        // time complexity = Big O(n)
        int n=sc.nextInt();
        int m=sc.nextInt();
        //Adjaency list
        List<List<Integer>> adjacencyList=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjacencyList.add(new ArrayList<>());
        }
        //Read/input the edges of the users
        for (int i=0;i<m;i++){
            int u=sc.nextInt();
            int v = sc.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }
        //print the adjaency list
        for (int i=1;i<=n;i++){
            System.out.print("Node: " + i + " ; list of neiboures: -> ");
            for (int neighbour: adjacencyList.get(i)){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}