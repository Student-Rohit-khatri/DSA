package com.rohit.Arrays;

import java.util.Arrays;

public class SwapOfArrayIndex {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]= arr[idx2];
        arr[idx2]=temp;
    }
}
