package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class MinimumPathSumGrid {
    public static void main(String[] args) {
        int dp[][] = new int[3][3];
        int grid[][] = {{10,8,2},{10,5,100},{1,1,2}};
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        System.out.println(minSum(2,2,dp,grid));
    }

    public static int minSum(int r, int c, int dp[][], int grid[][]){
        if(r == 0 && c == 0){
            return grid[r][c];
        }

        if(r < 0 || c < 0){
            return (int) Math.pow(10, 9);
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        int down = grid[r][c]+minSum(r-1,c,dp,grid);
        int right = grid[r][c] + minSum(r, c - 1, dp, grid);


        return dp[r][c] = Math.min(down,right);
    }

}
