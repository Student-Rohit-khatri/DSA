package com.rohit;


import java.util.*;

 public class practice {

     static int[] findArray(int[] pref) {
         int n = pref.length;
         int ans[] = new int[n];
         ans[0] = pref[0];

         for(int i = 1 ; i < n ; i++){
             int temp = 0;
             for(int j = 0 ; j < i; j++){
                 temp = temp ^ ans[j];
             }
             for(int k = 1 ; k < 10 ; k++){
                 temp = temp ^ k;
                 if(pref[i] == temp){
                     ans[i] = k;
                     break;
                 }
             }
         }

         return ans;
     }

     public static void main(String[] args) {
        int [] pref = {5,2,0,3,1};
         int result [] = findArray(pref);
         System.out.println(Arrays.toString(result));
     }



 }
