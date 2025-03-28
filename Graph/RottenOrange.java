package com.rohit.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public static void main(String[] args) {

    }

    public static int orangesRotting(int grid[][]){

        if(grid == null || grid.length == 0){
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;

        Queue<int []> queue = new LinkedList<>();
        int[][] vis = new int[n][m];
        int cntFresh = 0;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                    vis[i][j] = 2;
                }else {
                    vis[i][j] = 0;
                }
            }
        }


        return -1;
    }
}
