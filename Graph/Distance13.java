package com.rohit.Graph;
import java.util.*;

public class Distance13 {

    static int[][] nearest(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];

        Queue<Node> q = new LinkedList<>();

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1){
                    q.add(new Node(i,j,0));
                    vis[i][j] = 1;
                }else {
                    vis[i][j] = 0;
                }
            }
        }

        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};

        while (!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            q.remove();
            dist[row][col] = step;

            for (int i = 0 ; i < 4 ; i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow,ncol,step+1));
                }

            }

        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        int ans[][] = nearest(grid);
        for (int [] row : ans){
            for (int el : row){
                System.out.print(el);
            }
            System.out.println();
        }

    }


    static class Node {
        int first;
        int second;
        int third;

        Node(int _first, int _second, int _third) {
            this.first = _first;
            this.second = _second;
            this.third = _third;
        }
    }
}
