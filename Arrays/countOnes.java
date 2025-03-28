package com.rohit.Arrays;

public class countOnes {

    public static int count(int arr[]){
        int count = 0;
        int max = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                count++;
            }else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,1,1,0,0,1,1,1};
        System.out.println("The consecutive ones are : "+count(arr));
    }

}
