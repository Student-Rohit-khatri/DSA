package com.rohit.Dynamic_Programming.Tabulation;

public class MCM {

    public static void main(String[] args) {
        int arr[] = {10,30,5,60};
        int n = arr.length;

        System.out.println(matrixMultiplication(n,arr));
    }

    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][] = new int[N][N];

        for(int i = 1 ; i < N ; i++){
            dp[i][i] = 0;

        }

        for(int i = N - 1 ; i >= 1 ; i--){
            for(int j = i + 1 ; j < N ; j++){
                int mini = (int)1e9;

                for(int k = i ; k < j ; k++){
                    int steps = arr[i-1] * arr[k] * arr[j] + dp[i][k] + dp[k+1][j];

                    if(steps < mini) mini = steps;

                }

                dp[i][j] = mini;

            }
        }

        for(int a[] : dp){
            for(int it : a){
                System.out.print(it + " ");
            }
            System.out.println();
        }

        return dp[1][N-1];
    }

}
