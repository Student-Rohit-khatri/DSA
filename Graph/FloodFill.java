package com.rohit.Graph;

public class FloodFill {

    public static void main(String[] args) {
        int[][] image =  {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        int [][] answer = floodFill(image,1,1,2);
        for (int i = 0 ; i < answer.length ; i++){
            for (int j = 0 ; j < answer[0].length ; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        int initColor = image[sr][sc];
        int ans[][] = image;
        DFS(sr,sc,image,ans,newColor,initColor);

        return ans;
    }

    static void DFS(int sr,int sc , int image[][], int ans[][], int newColor,int initColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
            return;
        }
        if(ans[sr][sc] != initColor){
            return;
        }
        ans[sr][sc] = newColor;
        DFS(sr-1,sc,image,ans,newColor,initColor);
        DFS(sr,sc+1,image,ans,newColor,initColor);
        DFS(sr+1,sc,image,ans,newColor,initColor);
        DFS(sr,sc-1,image,ans,newColor,initColor);
    }
}
