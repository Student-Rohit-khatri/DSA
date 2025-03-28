package com.rohit.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class G17_NumberOfIsland {

    void dfs(int row , int col ,int vis[][], int grid[][], ArrayList<Integer> vec,int row0, int col0){
        vis[row][col] = 1;
        vec.add(row-row0,col-col0);
        int n = grid.length;
        int m = grid[0].length;
        int delRow [] = {-1,0,+1,0};
        int delCol[] = {0,-1,0,+1};

        for (int i = 0 ; i < 4 ; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                dfs(nrow,ncol,vis,grid,vec,row0,col0);
            }

        }

    }


    int countDistinctIslands(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        HashSet<ArrayList<Integer>> st = new HashSet<>();
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (vis[i][j] == 0 && grid[i][j] == 1){
                    ArrayList<Integer> vec = new ArrayList<>();
                    dfs(i,j,vis,grid,vec,i,j);
                    st.add(vec);
                }
            }
        }
        return st.size();
    }


    public static void main(String[] args) {
        int[][] grid =  {
                {0, 1, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 1, 0}
        };
        G17_NumberOfIsland grah = new G17_NumberOfIsland();
        System.out.println(grah.countDistinctIslands(grid));
    }



}
