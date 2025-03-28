package com.rohit;

public class evendigit {
    public static void main(String[] args) {
        int []arr={1,3,4,6,8,9};
        int ans = findnumber1(arr,0,0);
        System.out.println(ans);
    }
    public static int findnumber(int []arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    //calculating even digit using recursion
    public static int  findnumber1(int arr[],int s,int count){
        if( s == arr.length){
            return count;
        }
        if(arr[s]%2==0){
            count+=1;
        }
        return findnumber1(arr,s+1,count);
    }
}
