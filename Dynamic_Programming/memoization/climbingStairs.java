package com.rohit.Dynamic_Programming.memoization;

public class climbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsMemoization(3));
    }
    // Method using tabulation (bottom-up dynamic programming)
    public static int climbStairsTabulation(int n) {
        if (n <= 2)
            return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Method using memoization (top-down dynamic programming)
    public static int climbStairsMemoization(int n) {
        int[] memo = new int[n + 1];
        return climbStairsMemoizationHelper(n, memo);
    }

    private static int climbStairsMemoizationHelper(int n, int[] memo) {
        if (n <= 2)
            return n;

        if (memo[n] != 0)
            return memo[n];

        memo[n] = climbStairsMemoizationHelper(n - 1, memo) + climbStairsMemoizationHelper(n - 2, memo);
        return memo[n];
    }
}
