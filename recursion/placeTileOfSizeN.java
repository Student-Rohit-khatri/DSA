package com.rohit.recursion;

public class placeTileOfSizeN {
    public static void main(String[] args) {
        int n=4, m=2;
        int ans =  placeTiles(n,m);
        System.out.println(ans);
    }

    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacements = placeTiles(n-m,m);

        //horizontally
        int horPlacements = placeTiles(n-1,m);

        return vertPlacements+horPlacements;
    }

}
