package com.rohit.HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {
    public static void main(String[] args) {

       HashSet<Integer> set = new HashSet<>();

       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);
       // Hash set doesn't allow duplicates. In hash set we can add , search and delete in constant time.
       if(set.contains(1)){
           System.out.println("Set contains 1");
       }
        System.out.println(set.size());
        System.out.println(set);

        //printing the elements of the hashmap using loops
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
