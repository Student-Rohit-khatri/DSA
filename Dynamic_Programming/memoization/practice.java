package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}};

        System.out.println(maxSum(matrix));



    }

    public static int maxSum(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            int ans = maxSum(matrix,0,i,dp);
            max = Math.max(ans,max);
        }

        return max;
    }

    static int maxSum(int arr[][], int r , int c , int dp[][]){

        if(c < 0 || c >= arr[0].length){
            return (int) Math.pow(-10,9);
        }

        if(r == arr.length-1){
            return arr[r][c];
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        int down = arr[r][c] + maxSum(arr,r+1,c,dp);
        int lDia = arr[r][c] + maxSum(arr,r+1,c-1,dp);
        int rDia = arr[r][c] + maxSum(arr,r+1,c+1,dp);

        return dp[r][c] = Math.max(down,Math.max(lDia,rDia));
    }

}
