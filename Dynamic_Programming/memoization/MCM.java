package com.rohit.Dynamic_Programming.memoization;
import java.util.*;

public class MCM {

    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][] = new int[N][N];
        for(int num[] : dp){
            Arrays.fill(num,-1);
        }

        return minimum(1,N-1,arr,dp);

    }

    static int minimum(int i, int j , int arr[], int dp[][]){
        if(i == j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int min = (int)1e9;

        for(int k = i ; k < j ; k++){
            int steps = arr[i-1] * arr[k] * arr[j] + minimum(i,k,arr,dp) + minimum(k+1,j,arr,dp);
            if(steps < min){
                min = steps;
            }
        }

        return dp[i][j] = min;
    }

    public static void main(String[] args) {
        int arr[] = {10,30,5,60};
        int n = arr.length;

        System.out.println(matrixMultiplication(n,arr));
    }
}
