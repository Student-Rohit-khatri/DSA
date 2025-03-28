package com.rohit.Dynamic_Programming.spaceOptimization;

public class BuySellStock {
    public static void main(String[] args) {
        int []stock = {7,1,5,3,6,4};
        System.out.println("Maximum profit after selling stock is : "+profit(stock));
    }

    static int profit(int stock[]){
        int n = stock.length;

        int maxProfit = 0;
        int mini = stock[0];

        for (int i = 1 ; i < n ; i++){
            int currProfit = stock[i] - mini;
            maxProfit = Math.max(maxProfit,currProfit);
            mini = Math.min(mini,stock[i]);
        }

        return maxProfit;
    }

}
