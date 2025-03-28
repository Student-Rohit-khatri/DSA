package com.rohit.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //syntax of declaring array list
        ArrayList<Integer> list = new ArrayList<>();
       //list.add(67);
       //list.add(7);
        //list.add(6);
        //System.out.println(list);
        for(int i=0 ; i<5; i++){
            list.add(in.nextInt());
        }
        for (int i=0; i<5 ; i++){
            System.out.println(list.get(i));//pass index here ,list[index] syntax will not work here
        }
    }
}
