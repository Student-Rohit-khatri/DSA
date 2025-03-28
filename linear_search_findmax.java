package com.rohit;

public class linear_search_findmax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,87,9,100};
        System.out.println(printmax(arr));

    }
    public static int printmax(int arr[]){
        int ans= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
