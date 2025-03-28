package com.rohit;

public class Linear_search_findmin {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        System.out.println(printmin(arr));
    }
    //assume arr.length is not equal to zero
    public static int printmin(int []arr){
        int ans=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
