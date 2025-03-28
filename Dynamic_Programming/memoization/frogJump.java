package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class frogJump {

    public static int solve(int idx , int[] height , int[] dp){
        if(idx == 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = solve(idx-1,height,dp) + Math.abs(height[idx]-height[idx-1]);

        if(idx > 1){
            jumpTwo = solve(idx-2,height,dp) + Math.abs(height[idx] - height[idx-2]);
        }

        return dp[idx] = Math.min(jumpOne,jumpTwo);
    }

    public static void main(String[] args) {
        int height[] = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,height,dp));
    }
}
