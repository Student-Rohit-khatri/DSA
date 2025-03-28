package com.rohit.Maze_Question;

public class maze_permutation {
    public static void main(String[] args) {
        printPath("",3,3);


    }
    public static void printPath(String p,int r , int c){
        //you are at a (3,3) index and you can move Down and Right path
       if( r == 1 && c == 1){
           System.out.println(p);
           return;
       }
       if(r > 1 ){
           printPath(p+'D',r-1,c);
       }
       if(c>1){
           printPath(p+'R',r,c-1);
       }

    }

}
