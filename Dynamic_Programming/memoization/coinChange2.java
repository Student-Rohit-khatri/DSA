package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class coinChange2 {
    public static void main(String[] args) {
        int target = 4;
        int coins[] = {1,2,3};
        int n = coins.length;
        long dp[][] = new long[n][target+1];

        for (long []row : dp){
            Arrays.fill(row,-1);
        }
        System.out.println(coinChange(coins,dp,n-1,target));
    }

    public static long coinChange(int coins[],long dp[][], int idx , int target){

        if(idx == 0){
            if(target % coins[idx] == 0){
                return 1;
            }else {
                return 0;
            }
        }

        if(dp[idx][target] != -1){
            return dp[idx][target];
        }

        long nonPick = coinChange(coins,dp,idx-1,target);
        long pick = 0;

        if(coins[idx] <= target){
            pick = coinChange(coins,dp,idx,target-coins[idx]);
        }

        return dp[idx][target] = nonPick + pick;
    }

}
