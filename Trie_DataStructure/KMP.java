package com.rohit.Trie_DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String txt = "aaacbaacbaa";
        String pattern = "cba";

        ArrayList<Integer> ans= new ArrayList<>();
        ans = search(pattern,txt);

        System.out.println(ans);

    }

//    knuth-morris-pratt algorithm
    public static ArrayList<Integer> search(String pattern , String text){
        int N = text.length();
        int M = pattern.length();

        ArrayList<Integer> result = new ArrayList<>();

        int LPS[] = new int[M];
        computeLPS(pattern,LPS,M);

        int i = 0 ;
        int j = 0;

        while (i < N){
            if(j < M && text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }

            if(j == M){
                result.add(i - M + 1);
                j = LPS[j-1];
            }else if(text.charAt(i) != pattern.charAt(j)){
                if(j != 0){
                    j = LPS[j-1];
                }else {
                    i++;
                }
            }


        }

        return result;

    }

    public static void computeLPS(String pattern , int LPS[], int M){
        int len = 0; //length of previous longest prefix and suffix which where equal
        LPS[0] = 0;

        int i = 1;

        while (i < M){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }else {
                if(len != 0){
                    len = LPS[len - 1];
                }else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }

    }

}
