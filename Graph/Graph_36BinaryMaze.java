package com.rohit.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_36BinaryMaze {

    static int shortestPath(int[][] grid, int[] source, int[] destination){

        if(source[0] == destination[0] && source[1] == destination[1]){
            return 0;
        }

        Queue<tuple> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int dist[][] = new int[n][m];
        for (int [] row : dist){
            Arrays.fill(row,(int)1e9);
        }
        dist[source[0]][destination[1]] = 0;
        q.add(new tuple(0,source[0],source[1]));

        int dr[] = {-1,0,1,0};
        int dc[] = {0,1,0,-1};

        while (!q.isEmpty()){
            tuple it = q.peek();
            q.remove();
            int dis = it.first;
            int r = it.second;
            int c = it.third;

            for (int i = 0 ; i < 4 ; i++){
                int newRow = r + dr[i];
                int newCol = c + dc[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1 && dis+1 < dist[newRow][newCol]){
                    dist[newRow][newCol] = 1 + dis;

                    if(newRow == destination[0] && newCol == destination[1]){
                        return dis+1;
                    }
                    q.add(new tuple(1+dis,newRow,newCol));
                }

            }


        }

        return -1;

    }

    public static void main(String[] args) {
        int[] source={0,1};
        int[] destination={2,2};

        int[][] grid={{1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 1}};

        int res = shortestPath(grid, source, destination);

        System.out.print(res);

    }
    static class tuple {
        int first, second, third;
        tuple(int _first, int _second, int _third) {
            this.first = _first;
            this.second = _second;
            this.third = _third;
        }
    }

}

