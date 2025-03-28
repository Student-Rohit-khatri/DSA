package com.rohit.Graph;
import java.util.*;

public class detectCycleUndirected {

    //This is a Bfs approach
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj , int s, boolean vis[], int parent[]){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(s,-1));
        vis[s] = true;

        while (!queue.isEmpty()){
            int node = queue.peek().first;
            int par = queue.peek().second;

            queue.poll();

            for (Integer it: adj.get(node)){
                if(!vis[it]){
                    queue.add(new Node(it,node));
                    vis[it] = true;
                }else if (it != par){
                    return true;
                }
            }

        }

        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        int parent[] = new int[V];
        Arrays.fill(parent,-1);

        for (int i = 0 ; i < V ; i++){
            if(!vis[i]){
                if(checkForCycle(adj,i,vis,parent)){
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

        boolean ans = isCycle(4, adj);

        //Output is 0 . In this case cycle doesn't exist.
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");

    }

    static class Node {
        int first;
        int second;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
