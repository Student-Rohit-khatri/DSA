package com.rohit;

public class linear_search_range {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 ,6};
        System.out.println(search(arr,6,2,4));
    }
    public static int search(int arr[],int target , int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i= start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
