package com.rohit.Maze_Question;

public class obstacleMaze {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        printPathWithObstacle("",board,0,0);

    }
    public static void  printPathWithObstacle(String s ,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1 ){
            System.out.println(s);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if( r < maze.length-1){
            printPathWithObstacle(s+'D',maze,r+1,c);
        }
        if( c < maze[0].length-1){
            printPathWithObstacle(s+'R',maze,r,c+1);
        }

    }
}
