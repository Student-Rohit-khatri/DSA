package com.rohit.recursion;

import java.util.Arrays;

public class quickSortFirstElement {

    public static void QuickSort(int arr[], int low , int high){
        if(low < high){
            int pivotIdx = partition(arr,low,high);
            QuickSort(arr,low,pivotIdx-1);
            QuickSort(arr,pivotIdx+1,high);
        }

    }

    public static int partition(int arr[], int low , int high){
        int pivot = arr[low];
        int left = low;
        int right = high;

        while(left < right){
            while (arr[left] <= pivot && left <= high-1){
                left++;
            }
            while (arr[right] > pivot && right >= low+1){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        return right;

    }
    // Driver Code
    public static void main(String args[])
    {
        int arr[] = {4,3,2,1,9,15,18,2,7,30,33};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
