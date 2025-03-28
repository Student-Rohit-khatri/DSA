package com.rohit;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int []arr = {2,3,1,5,9,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection (int []arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int []arr,int start,int end){
        int max = start;
        for(int i=start; i<=end ; i++){
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }

}
