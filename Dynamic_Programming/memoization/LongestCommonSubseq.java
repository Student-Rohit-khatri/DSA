package com.rohit.Dynamic_Programming.memoization;

import java.util.Arrays;
import java.util.*;

public class LongestCommonSubseq {

    public static void main(String[] args) {
        String s1 = "acd";
        String s2 = "ced";
        int n = s1.length();
        int dp[][] = new int[n][n];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        System.out.println(subseq(n-1,n-1,s1,s2,dp));
    }

    static int subseq(int idx1, int idx2, String s1, String s2, int dp[][]){
        if(idx1 < 0 || idx2 < 0){
            return 0;
        }

        if(dp[idx1][idx2] != -1){
            return dp[idx1][idx2];
        }
        if(s1.charAt(idx1) == s2.charAt(idx2)){
           return dp[idx1][idx2] = 1 + subseq(idx1-1,idx2-1,s1,s2,dp);
        }else {
            return dp[idx1][idx2] = Math.max(subseq(idx1-1,idx2,s1,s2,dp),subseq(idx1,idx2-1,s1,s2,dp));
        }


    }

}
