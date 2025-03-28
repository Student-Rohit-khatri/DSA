package com.rohit.recursion;

public class removeDuplicate {
    public static boolean[] map = new boolean[25];

    public static void main(String[] args) {
        String str = "abbccda";
        removeDup(str,0,"");
    }
    public static void removeDup(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDup(str,idx+1,newstring);
        }else{
            newstring +=currChar;
            map[currChar - 'a'] = true;
            removeDup(str,idx+1,newstring);
        }
    }
}
