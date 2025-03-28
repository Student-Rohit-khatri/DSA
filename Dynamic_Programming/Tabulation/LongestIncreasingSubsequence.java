package com.rohit.Dynamic_Programming.Tabulation;

public class LongestIncreasingSubsequence {
    public static void lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n+1][n+1];

        for(int idx = n-1 ; idx >= 0 ; idx--){
            for(int prev = idx-1 ; prev >= -1 ; prev--){
                int len = 0 + dp[idx+1][prev+1];
                if(prev == -1 || nums[idx] > nums[prev]){
                    len = Math.max(len,1+dp[idx+1][idx+1]);
                }
                dp[idx][prev+1] = len;
            }
        }

        for(int arr[] : dp){
            for(int it : arr){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,9,2,5,3,7,101,18};
        lengthOfLIS(arr);
    }

}
