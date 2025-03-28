package com.rohit.Graph;
import java.util.*;

public class FirstGraph {


    static class Edge{
        int src;
        int dest;
        int wt;

        //This constructor is for a non-weighted graph
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

        //this constructor is for a weighted graph
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
//      This is for an unweighted graph

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));


        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));


        //This is for a weighted Graph
//        graph[0].add(new Edge(0,2,2));
//
//        graph[1].add(new Edge(1,2,10));
//        graph[1].add(new Edge(1,3,0));
//
//        graph[2].add(new Edge(2,0,2));
//        graph[2].add(new Edge(2,1,10));
//        graph[2].add(new Edge(2,3,-1));
//
//        graph[3].add(new Edge(3,1,0));
//        graph[3].add(new Edge(3,2,-1));

    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i = 0 ; i < graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[] , int curr , boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i = 0 ; i < graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph,e.dest,vis);
            }

        }

    }
    public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[] , int curr , String path , int tar){
        if(curr == tar ){
            System.out.println(path);
            return;
        }
        for(int i = 0 ; i < graph[curr].size() ; i++ ){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printAllPaths(graph,vis,e.dest,path+e.dest,tar);
                vis[curr] = false;
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;

//        1----3
//       /     | \
//       0     |  5--6
//        \    | /
//         2---4


        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        //print 2's neighbours
//        for(int i = 0 ; i < graph[2].size() ; i++){
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest+", "+e.wt);
//        }
        int src = 0;
        int tar = 5;
        printAllPaths(graph,vis,src,"0",tar);


    }
}
