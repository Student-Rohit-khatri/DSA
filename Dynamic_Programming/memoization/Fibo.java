package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        //This a done by tabulation which is bottom up approach
//        int n = 45;
//        int dp[] = new int[n+1];
//        Arrays.fill(dp,-1);
//        dp[0] = 0;
//        dp[1] = 1;
//
//        for(int i = 2 ; i <= n ; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        System.out.println(dp[n]);


        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n,dp));

    }
    //This is done by memoization.
    public static int f(int n , int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(n-1,dp) + f(n-2,dp);
    }
}
