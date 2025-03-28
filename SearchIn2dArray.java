package com.rohit;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target = 3;
        int [] ans = search(target,arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int target,int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(arr[i][j]==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
