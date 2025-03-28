package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class knapSack01 {
    public static void main(String[] args) {
        int weight[] = {1,2,4,5};
        int val[] = {5,4,8,6};
        int n = val.length;
        int wt = 5;
        int dp[][] = new int[n][wt+1];

        for (int[] row : dp){
            Arrays.fill(row,-1);
        }

        System.out.println(maxSum(weight.length-1,weight,val,wt,dp));

    }

    public static int maxSum(int idx , int weight[], int val[],int wt,int dp[][]){
        if(idx == 0){
            if(weight[idx] <= wt){
                return val[idx];
            }else {
                return 0;
            }
        }

        if(dp[idx][wt] != -1){
            return dp[idx][wt];
        }

        int nonPick = 0 + maxSum(idx-1,weight,val,wt,dp);
        int pick = Integer.MIN_VALUE;

        if(weight[idx] < wt){
            pick = val[idx] + maxSum(idx-1,weight,val,wt-weight[idx],dp);
        }

        return dp[idx][wt] = Math.max(nonPick,pick);
    }

}
