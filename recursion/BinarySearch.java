package com.rohit.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {2,4,6,8,9,10,45,49};
        System.out.println(Bs(arr,0,arr.length-1,9));
    }
    public static int Bs(int []arr, int s, int e,int target){

        if(s > e){
            return -1;
        }
        int m = s+(e-s)/2;
        boolean isInc = arr[s]<arr[s+1];
        if (isInc){
            if(target < arr[m]){
                return Bs(arr,s,m-1,target);
            } else if (target > arr[m]) {
                return Bs(arr,m+1,e,target);

            }else {
                return m;
            }
        }else {
            if(target < arr[m]){
                Bs(arr,m+1,e,target);
            } else if (target > arr[m]) {
                Bs(arr,s,m-1,target);
            }else {
                return m;
            }
        }
        return -1;
    }
}
