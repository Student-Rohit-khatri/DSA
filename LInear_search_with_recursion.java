package com.rohit;

import java.util.Arrays;

public class LInear_search_with_recursion {
    public static void main(String[] args) {
        int arr[]={9,4,3,8,1};
        ss(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int LS(int arr[], int target,int s){
        if(s == arr.length){
            return -1;
        }
       if(arr[s]==target){
           return s;
       }else{
           return LS(arr,target,s+1);
       }
    }
    public static void BS(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void ss(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i ;
            for(int j=1+i; j<arr.length; j++){
                if(arr[min] >arr[j]){
                    min = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] =  temp;
        }
    }


}
