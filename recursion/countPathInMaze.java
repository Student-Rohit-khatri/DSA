package com.rohit.recursion;

public class countPathInMaze {
    public static void main(String[] args) {
        int n=3, m =3;
        int totalPaths=countPath(0,0,n,m);
        System.out.println(totalPaths);
    }
    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downward
        int downpaths = countPath(i+1,j,n,m);

        //move right
        int rightPaths = countPath(i,j+1,n,m);

        return downpaths+rightPaths;
    }

}
