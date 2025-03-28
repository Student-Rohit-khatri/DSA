package com.rohit.Back_Tracking;

public class N_Knight_Problem {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,4);

    }
    static void knight(boolean[][] board, int r, int c, int k){
        if( k == 0){
            display(board);
            System.out.println();
            return;
        }

        if (r == board.length-1 && c == board.length){
            return;
        }

        if( c == board.length){
            knight(board,r+1,0,k);
            return;
        }
        if (isSafe(board,r,c)){
            board[r][c] = true;
            knight(board,r,c+1,k-1);
            board[r][c] = false;
        }
        knight(board,r,c+1,k);
    }

    public static boolean isSafe(boolean[][] board, int r , int c){
        if(isValid(board,r-2,c-1)){
            if (board[r-2][c-1]){
                return false;
            }
        }
        if(isValid(board,r-1,c-2)){
            if (board[r-1][c-2]){
                return false;
            }
        }
        if(isValid(board,r-2,c+1)){
            if (board[r-2][c+1]){
                return false;
            }
        }
        if(isValid(board,r-1,c+2)){
            if (board[r-1][c+2]){
                return false;
            }
        }
        return true;

    }

    //do not repeat your self hence created this function
    static boolean isValid(boolean[][] board, int r, int c){
        if ( r >= 0 && r < board.length && c >= 0 && c < board.length){
            return true;
        }
        return false;
    }

    public static void display(boolean [][] board){

        for (boolean[] row: board){
            for (boolean element : row){
                if (element){
                    System.out.print("K"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

    }

}
