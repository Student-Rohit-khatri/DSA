package com.rohit;

public class Linear_search_string {
    public static void main(String[] args) {
        String str = "ROHIT";
        char target = 'R';
        System.out.println(search(str,target));
    }
    public static boolean search(String str, char target ){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
