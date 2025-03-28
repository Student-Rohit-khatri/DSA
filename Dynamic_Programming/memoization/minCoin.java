package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class minCoin {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int T = 7;

        // Call the minimumElements function and print the result
        System.out.println("The minimum number of coins required to form the target sum is " + MinElement(arr, T));
    }


    public static int MinElement(int coins[], int T){
        int n = coins.length;
        int dp[][] = new int[n][T+1];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = MinElementUntil(coins,n-1,dp,T);

        if (ans >= (int) Math.pow(10, 9)) {
            return -1;
        }

        return ans;
    }
    private static int MinElementUntil(int[] coins, int idx , int dp[][], int T){
        if(idx == 0){
            if(T % coins[idx] == 0){
                return T/coins[idx];
            }else {
                return (int) Math.pow(10,9);
            }
        }

        if(dp[idx][T] != -1){
            return dp[idx][T];
        }

        int notTaken = 0 + MinElementUntil(coins,idx-1,dp,T);
        int taken = (int) Math.pow(10,9);

        if(coins[idx] <= T){
            taken = 1 + MinElementUntil(coins,idx,dp,T-coins[idx]);
        }

        return dp[idx][T] = Math.min(taken,notTaken);
    }
}
