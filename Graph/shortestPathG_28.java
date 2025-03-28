package com.rohit.Graph;

import java.io.IOException;
import java.util.*;

public class shortestPathG_28 {

    public static int[] shortestPath(int[][] edges,int n,int m ,int src){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0 ; i < m ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int dist[] = new int[n];
        Arrays.fill(dist,(int)1e9);

        dist[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for (int it: adj.get(node)){
                if (dist[node]+1 < dist[it]){
                    dist[it] = 1 + dist[node];
                    q.add(it);
                }
            }
        }

        for (int i = 0 ; i < n ; i++){
            if (dist[i] == 1e9){
                dist[i] = -1;
            }
        }

        return dist;

    }

    public static void main(String[] args) throws IOException {
        int n=9, m=10;
        int[][] edge = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};

        int res[] = shortestPath(edge,n,m,0);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();


    }
}
