package com.rohit.Graph;

import java.util.*;

public class kahn_TopoSort {

    //This is a BFs Approach
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int inDegree[] = new int[V];
        for (int i = 0 ; i < V ; i++){
            for (int it : adj.get(i)){
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0 ; i < V ; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }

        int topo[] = new int[V];
        int i = 0;
        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo[i++] = node;

            for (int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }

        }

        return topo;
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

        int[] ans = topoSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }

    }

}
