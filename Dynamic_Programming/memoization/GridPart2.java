package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class GridPart2 {
    public static void main(String[] args) {
        int grid[][] = {{0,0,0},{0,-1,0},{0,0,0}};
        int dp [][] = new int[3][3];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        System.out.println(path(2,2,grid,dp));
    }
    public static int path(int r,int c, int grid[][],int dp[][]){
        if(r >= 0 && c >= 0 && grid[r][c] == -1){
            return 0;
        }

        if(r == 0 && c == 0){
            return 1;
        }
        if(r < 0 || c < 0){
            return 0;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }

        int down = path(r-1,c,grid,dp);
        int right = path(r,c-1,grid,dp);

        return dp[r][c] = down+right;
    }

}
