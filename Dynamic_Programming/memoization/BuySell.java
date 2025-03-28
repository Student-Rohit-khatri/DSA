package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class BuySell {
    public static void main(String[] args) {
        int stock[] = {7, 1, 5, 3, 6, 4};
        int n = stock.length;
        int dp[][] = new int[n][2];
        for (int []row : dp){
            Arrays.fill(row,-1);
        }

        System.out.println(maxProfit(0,n,0,stock,dp));
    }
    static int maxProfit(int idx,int n, int buy,int stock[],int dp[][]){
        if(idx == stock.length){
            return 0;
        }
        if(dp[idx][buy] != -1){
            return dp[idx][buy];
        }
        int profit = 0;

        if(buy == 0){
            profit = Math.max(0+maxProfit(idx+1,n,0,stock,dp),-stock[idx]+maxProfit(idx+1,n,1,stock,dp));
        }
        if(buy == 1){
            profit = Math.max(0+maxProfit(idx+1,n,1,stock,dp),stock[idx]+maxProfit(idx+1,n,0,stock,dp));
        }

        return dp[idx][buy] = profit;
    }
}
