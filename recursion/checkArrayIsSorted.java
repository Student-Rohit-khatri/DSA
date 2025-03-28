package com.rohit.recursion;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={9,8,7,4,3,2,1};
        System.out.println(checkSorted(arr,1));
    }
    public static boolean checkSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx-1]>arr[idx]){
            return checkSorted(arr,idx+1);
        }else{
            return false;
        }
    }
}
