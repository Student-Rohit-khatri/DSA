package com.rohit;

import java.util.Arrays;

public class Recursion_selection_sort {
    public static void main(String[] args) {
        int arr[] = {3,5,4,7,8,9};
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int arr[],int r, int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){

            if(arr[max] < arr[c]){
                selectionsort(arr,r,c+1, c);
            }else{
                selectionsort(arr,r,c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr,r-1,0,0);
        }

    }
}
