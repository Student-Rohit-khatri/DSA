package com.rohit.Disjoint_Datastructure;

import java.util.ArrayList;
import java.util.List;

public class DSU {

     static class Disjoint{
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();

        public Disjoint(int n){
            for(int i = 0 ; i <= n ; i++){
                parent.add(i);
                size.add(1);
            }
        }

        private int findParent(int node){
            if(node == parent.get(node)){
                return node;
            }
            int ulp = findParent(parent.get(node));
            parent.set(node,ulp);

            return parent.get(node);
        }

        public void unionBySize(int u , int v){
            int parU = findParent(u);
            int parV = findParent(v);

            if(parU == parV){
                return;
            }

            if(size.get(parU) < size.get(parV)){
                parent.set(parU,parV);
                size.set(parV, size.get(parU)+ size.get(parV));
            }else {
                parent.set(parV,parU);
                size.set(parU, size.get(parU) + size.get(parV));
            }

        }

    }

    public static void main(String[] args) {

    }
}
