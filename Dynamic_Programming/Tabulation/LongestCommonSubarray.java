package com.rohit.Dynamic_Programming.Tabulation;

public class LongestCommonSubarray {
    public static int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int longestSub = 0;

        int dp[][] = new int[m+1][n+1];
        for(int i = 1 ; i < m + 1 ; i++){
            for(int j = 1 ; j < n + 1 ; j++){
                int num1 = nums1[i-1];
                int num2 = nums2[j-1];
                if(num1 == num2){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    longestSub = Math.max(longestSub , dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        for(int arr[] : dp){
            for(int it : arr){
                System.out.print(it + " ");
            }
            System.out.println();
        }

        return longestSub;
    }
    public static void main(String[] args) {
        int num1[] = {1,2,3,2,1};
        int num2[] = {3,2,1,4,7};

        System.out.println(findLength(num1,num2));
    }
}
