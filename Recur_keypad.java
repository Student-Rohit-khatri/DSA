package com.rohit;

public class Recur_keypad {
    public static void main(String[] args) {
        String str= "23";
        printcomb(str, 0, "");
    }
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar-'0'];

        for(int i=0; i<mapping.length()-1; i++){
            printcomb(str, idx+1, combination+mapping.charAt(i));

        }
    }

}
