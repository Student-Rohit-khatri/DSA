package com.rohit.recursion;

public class permutation {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str.toCharArray(),0);
    }

    public static void permute(char[] arr, int strt){
        if(strt == arr.length-1){
            System.out.println(arr);
            return;
        }

        for(int i= strt; i < arr.length ; i++){
            swap(arr,i,strt);
            permute(arr,strt+1);
            swap(arr,i,strt);
        }
    }

    public static void swap(char[] ar, int i , int fi){
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

}
