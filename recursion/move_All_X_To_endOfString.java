package com.rohit.recursion;

public class move_All_X_To_endOfString {
    public static void main(String[] args) {
        String str = "XXTENTATION";
        moveAllX(str,0,0,"");
    }
    public static void moveAllX(String str, int idx, int count, String s){
        if(idx == str.length()){
            for(int i=0; i<count;i++){
                s +='X';
            }
            System.out.println(s);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'|| currChar =='X'){
            moveAllX(str,idx+1,count+1,s);
        }else{
            s += currChar;
            moveAllX(str,idx+1,count,s);
        }
    }
}
