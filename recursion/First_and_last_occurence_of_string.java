package com.rohit.recursion;

public class First_and_last_occurence_of_string {
    public static int first = -1;
    public static int last = -1;
    public static void main(String[] args) {
        String str = "abcaadbae";
        occurance(str,0,'a');
    }
    public static void occurance(String str,int idx, char element){

        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        occurance(str,idx+1,element);
    }

}
