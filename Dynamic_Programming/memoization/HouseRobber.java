package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

        int money[] = {1,2,3};
        System.out.println(Robber(money.length,money));

    }

    public static int Robber(int idx,int money[]){
        int n = money.length;
        if(idx == 0){
            return 0;
        }

        if(idx == 1){
            return money[0];
        }

        int dp[] = new int[n];

        Arrays.fill(dp,-1);
        int ans1 = Rob(0, money.length-2,dp,money);

        Arrays.fill(dp,-1);
        int ans2 = Rob(1, money.length-1,dp,money);

        return Math.max(ans1,ans2);

    }

    private static int Rob(int s,int e, int dp[], int money[]){
        if(s > e){
            return 0;
        }
        if(dp[s] != -1){
            return dp[s];
        }
        int pick = money[s]+Rob(s+2,e,dp,money);
        int nonPick = 0 + Rob(s+1,e,dp,money);

        return dp[s] = Math.max(pick,nonPick);
    }

}
