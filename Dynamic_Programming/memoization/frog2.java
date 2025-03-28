package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class frog2 {
    public static int minimizeCost(int arr[], int N, int K) {
        // code here
        int dp[] = new int[N];
        Arrays.fill(dp,-1);

        return helper(N-1,arr,dp,K);
    }
    public static int helper(int n , int arr[], int dp[], int k){
        if(n == 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        int minStep = Integer.MAX_VALUE;

        for(int i = 1 ; i <= k ; i++){
            if(n-i >= 0){
                int jump = helper(n-i,arr,dp,k) + Math.abs(arr[n] - arr[n-i]);
                minStep = Math.min(jump,minStep);
            }
        }

        return dp[n] = minStep;
    }

    public static void main(String[] args) {
        int arr[] =  {10, 30, 40, 50, 20};
        int k = 3;
        int n = arr.length;
        System.out.println(minimizeCost(arr,n,k));
    }

}
