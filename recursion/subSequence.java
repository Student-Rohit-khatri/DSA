package com.rohit.recursion;

public class subSequence {
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str,0,"");
    }
    public static void subsequence(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }

        char currChar = str.charAt(idx);
        //it have two choices
        subsequence(str,idx+1,newstring+currChar);//to be in

        //or not to be in
        subsequence(str,idx+1,newstring);
    }
}
