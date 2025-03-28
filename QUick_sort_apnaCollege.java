package com.rohit;

public class QUick_sort_apnaCollege {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr,0,n-1);
        for(int i =0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[] , int low , int high){
        if(low < high){
            int pivotIdx = partition(arr , low , high);

            quicksort(arr,low,pivotIdx-1);
            quicksort(arr,pivotIdx+1,high);
        }
    }
    public static int partition(int arr[], int low , int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low ; j<high ; j++){
            if(arr[j] < pivot){
                i++;

                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
}
