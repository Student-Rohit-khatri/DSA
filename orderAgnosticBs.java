package com.rohit;

public class orderAgnosticBs {
    public static void main(String[] args) {
        int []arr= {98,97,55,43,23,10,9,5,3,2,1,-3,-9,-89};
        int target = -9;
        System.out.println(BS(arr,target));
    }
    public static int BS(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find the array is whether in ascending or descending order
        boolean isAsc = arr[start]<arr[end];

        while(start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
