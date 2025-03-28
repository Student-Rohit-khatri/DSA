package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class Grid {
    public static void main(String[] args) {
        int dp[][] = new int[3][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(paths(2,1,dp));
    }
    public static int paths(int r, int c,int dp[][]){

        if(r == 0 && c == 0){
            return 1;
        }

        if(r < 0 || c < 0){
            return 0;
        }

        if(dp[r][c]!= -1){
            return dp[r][c];
        }


        int down = paths(r-1,c,dp);



        int right = paths(r,c-1,dp);


        return dp[r][c] = down+right;

    }
}
