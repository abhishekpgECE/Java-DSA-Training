package com.advanced.dsa.dataStrutures.nonLinear.graphs.algorithms.topsorting.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {
    //helper method for dfs
    private void dfs(int node, int[] vis, Stack<Integer>st,
                     ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for (int neigbhour : adj.get(node)){
            if (vis[neigbhour] ==0){
                dfs(neigbhour,vis,st,adj);
            }
        }
        st.push(node);//only after dfs finished ,push to stock
    }
    public List<Integer> toposort(int v,ArrayList<ArrayList<Integer>> adj){
        int[] vis=new int[v];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<v;i++){
            if (vis[i]==0){
                dfs(i,vis,st,adj);
            }
        }
        List<Integer> ans=new ArrayList<>();
        while (!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;

    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        //we have to itiliaze with empty array
        for(int i=0; i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortDFS obj=new TopologicalSortDFS();
        List<Integer> ans = obj.toposort(v , adj);
        System.out.println("The toposort Linear Ordering u <--> v is ;  ");
        for (int node:ans){
            System.out.print(node + " ");
        }
        System.out.println();

    }
}