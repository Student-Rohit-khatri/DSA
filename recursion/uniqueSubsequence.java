package com.rohit.recursion;

import java.util.HashSet;

public class uniqueSubsequence {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str,0,"",set);
    }
    public static void subsequence(String str, int idx, String newstring, HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //it have two choices
        subsequence(str,idx+1,newstring+currChar,set);//to be in

        //or not to be in
        subsequence(str,idx+1,newstring,set);
    }
}
