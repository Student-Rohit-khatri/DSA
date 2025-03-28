package com.rohit;

public class Search_practice {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int target = 5;
        int ans= BS(arr,target);
        System.out.println(ans);

    }
    //linear search
    public static int linearsearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]){
                return i;
            }

        }
        return -1;
    }
    //range search in linear search
    public static int rangesearch(int [] arr,int target ,int start ,int end){
        for(int i= start; i<=end ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    //linear search in 2D array
    public static int[] Search(int [][]arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //linear search in string
    public static boolean search (String str, char target){
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    // binary search
    public static int BS(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isasc = arr[start]<arr[end];
        while(start<=end){
            //finding mid term
            int mid = start + (end-start)/2;
            if(isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }else{
                if(target < arr[mid]){
                   start = mid+1;
                } else if (target>arr[mid]) {
                   end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

}
