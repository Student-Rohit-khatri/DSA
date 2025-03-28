package com.rohit.Maze_Question;

public class maze_path {
    public static void main(String[] args) {
        printPath("",3,3);
    }
    public static void printPath(String s , int r, int c){
        //in this condition we can move to left , right and diagonally
        if( r == 1 && c == 1){
            System.out.println(s);
            return ;
        }

        if(r>1 && c > 1){
            printPath(s+'D',r-1,c-1);
        }
        if(r>1){
            printPath(s+'V',r-1,c);
        }
        if(c>1){
            printPath(s+'H',r,c-1);
        }

    }

}
