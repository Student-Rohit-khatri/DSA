package com.rohit.subsets;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {

        System.out.println(subSeqReturn("","abc"));
    }
    public static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    // Another method to do the same thing
    public static ArrayList<String> subSeqReturn(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p+ch,up.substring(1));
        ArrayList<String> right = subSeqReturn(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
