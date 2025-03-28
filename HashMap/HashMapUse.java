package com.rohit.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUse {
    public static void main(String[] args) {
        //In hash map key is different but value can be same;
        //for Example; we are implementing
        // country(key) , population(value)
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Nepal",120);
        map.put("India",130);
        map.put("China",150);
        System.out.println(map);
        //if I again insert same key with different value it with assign new value to that key.for eg:
        map.put("Nepal",230);
        System.out.println(map);

        //search operation
        //it will return true or false
        System.out.println(map.containsKey("Nepal"));

        //it returns the value of key
        System.out.println(map.get("China"));

        //iteration in HashMap
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        map.remove("China");
        System.out.println(map);

    }
}
