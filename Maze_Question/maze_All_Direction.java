package com.rohit.Maze_Question;

public class maze_All_Direction {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        printPath("",board,0,0);

    }

    public static void printPath(String s, boolean[][] maze , int r , int c){
        if(r == maze.length-1 && c == maze[0].length-1 ){
            System.out.println(s);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //i'm considering this block in my path
        maze[r][c] = false;

        if( r < maze.length-1){
            printPath(s+'D',maze,r+1,c);
        }
        if( c < maze[0].length-1){
            printPath(s+'R',maze,r,c+1);
        }
        if( r > 0){
            printPath(s+'U',maze,r-1,c);
        }
        if(c > 0){
            printPath(s+'L',maze,r,c-1);
        }

        //this is a line where the function will be over
        //so before the function gets removed, also remove the changes that were made by the first function

        maze[r][c] = true;

    }
}
