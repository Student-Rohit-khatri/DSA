package com.rohit.recursion;

import java.util.ArrayList;

public class subsetOfNNaturalNumber {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n,subset);
    }
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size() ; i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        //adding into subset
        subset.add(n);
        findSubset(n-1,subset);

        //not adding into subset
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }
}
