package com.rohit.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class G21_TopologicalSort {
    private static void DFS(int node , int vis[], Stack<Integer> st , ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for (int it: adj.get(node)){
            if (vis[it] == 0){
                DFS(it,vis,st,adj);
            }
        }
        st.push(node);

    }

    static int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];

        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < V ; i++){
            if (vis[i] == 0){
                DFS(i,vis,st,adj);
            }
        }

        int ans[] = new int[V];
        int i = 0;
        while (!st.isEmpty()){
            ans[i++] = st.peek();
            st.pop();
        }

        return ans;

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = topologicalSort(V,adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
}
