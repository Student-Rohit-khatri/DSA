package com.rohit;

public class Maximum_wealth {
    public static void main(String[] args) {
        int [][]nums = {{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println(maximum(nums));



    }
   public static int maximum(int [][]nums){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<nums.length; person++){
            int sum = 0;
            for(int account = 0; account<nums[person].length; account++){
                sum+= nums[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
   }
}
