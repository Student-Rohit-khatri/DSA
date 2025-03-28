package com.rohit.recursion;

public class findDuplicateChar {
    public static void main(String[] args) {
        String str = "abbcdefbb";
        moveX(str,0,'b',0);
    }
    public static void moveX(String str,int idx, char target,int n){
        if(idx==str.length()){
            System.out.println(n);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==target){
            moveX(str,idx+1,target,n+1);
        }else{
            moveX(str,idx+1,target,n);
        }
    }
}
