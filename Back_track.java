package com.rohit;

public class Back_track {
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "",0);
    }
    public static void printpermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i)+ str.substring(i+1);
            printpermutation(newstr, perm+currchar,idx+1);
        }
    }

}
