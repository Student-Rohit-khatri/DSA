package com.rohit.Graph;
import java.util.*;

public class prac {

    static class node{
        int ver;
        int par;

        public node(int ver, int par) {
            this.ver = ver;
            this.par = par;
        }
    }

    public static boolean IsCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];


        for(int i = 0 ; i < V ; i++){
            if(vis[i] == 0){
                if(checkForCycle(adj,i,vis)){
                    return true;
                }
            }
        }

        return false;
    }

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj , int v , int vis[]){
        Queue<node> q = new LinkedList<>();
        q.add(new node(v,-1));
        vis[v] = 1;

        while (!q.isEmpty()){
            int node = q.peek().ver;
            int parent = q.peek().par;
            q.remove();

            for(int it: adj.get(node)){
                if(vis[it] == 0){
                    vis[it] = 1;
                    q.add(new node(it,node));
                } else if (it != parent) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);


        boolean ans = IsCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

}
