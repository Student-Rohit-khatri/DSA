package com.rohit;

public class linear_search_array {
    public static void main(String[] args) {
        int [] nums={1,4,3,2,5};
        System.out.println(linearsearch(4,nums));
    }
    public static int linearsearch(int target,int []nums){
        if(nums.length == 0){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
