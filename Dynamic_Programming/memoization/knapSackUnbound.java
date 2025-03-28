package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class knapSackUnbound {
    public static void main(String[] args) {

        int wt[] = { 2, 4, 6 };
        int val[] = { 5, 11, 13 };
        int W = 10;

        int n = wt.length;
        int dp[][] = new int[n][W+1];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        System.out.println(knapSack(wt,n-1,val,dp,W));

    }
    public static int knapSack(int wt[],int idx , int val[],int dp[][],int wei){
        if(idx == 0){
            return ((int) (wei/wt[idx])) * val[idx];
        }


        if(dp[idx][wei] != -1){
            return dp[idx][wei];
        }

        int nonPick = 0 + knapSack(wt,idx-1,val,dp,wei);
        int pick = Integer.MIN_VALUE;

        if(wt[idx] <= wei){
            pick = val[idx]+knapSack(wt,idx,val,dp,wei-wt[idx]);
        }

        return dp[idx][wei] = Math.max(nonPick,pick);
    }
}
