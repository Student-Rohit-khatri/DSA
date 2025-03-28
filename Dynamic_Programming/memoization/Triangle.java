package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {

        int Triangle[][] = {{1},{2,3},{3,6,7},{8,9,6,10}};
        int n = Triangle.length;
        int dp[][] = new int[3][3];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        System.out.println( minPath(0,0,dp,Triangle,n));
    }
    public static int minPath(int r, int c,int dp[][], int Triangle[][], int n){
        if(r == n-1){
            return Triangle[r][c];
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        int down =Triangle[r][c] + minPath(r+1,c,dp,Triangle,n);
        int diagonal = Triangle[r][c] + minPath(r+1,c+1,dp,Triangle,n);

        return dp[r][c] = Math.min(down,diagonal);
    }
}
