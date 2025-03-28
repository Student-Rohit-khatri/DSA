package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class AdjacentElementMaxSum {
    public static void main(String[] args) {

        int Element[] = {2,1,4,9};
        int n = Element.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(maxSum(n-1,Element,dp));


    }
    public static int maxSum(int idx, int Element[], int dp[]){
        if(idx == 0){
            return Element[idx];
        }

        if(idx < 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int pick = Element[idx]+maxSum(idx-2,Element,dp);
        int nonPick = 0 + maxSum(idx-1,Element,dp);

        return dp[idx] = Math.max(pick,nonPick);
    }

}
