package com.rohit;

public class Recur_remove_duplicate {
    public static boolean [] map = new boolean[26];
    public static void main(String[] args) {

       String str = "abbccda";
       removeDuplicates(str, 0, "");

    }
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true ){
            removeDuplicates(str,idx+1, newString);
        }else{
            newString +=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }

    }

}
