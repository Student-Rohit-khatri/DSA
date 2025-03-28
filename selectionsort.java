package com.rohit;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};
        ss(arr);


    }
    public static void ss(int arr[]){
        for(int i=0; i<arr.length ; i++){
            int max = i;
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int t = arr[i];
            arr[i]=arr[max];
            arr[max]=t;

        }
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
