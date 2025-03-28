package com.rohit;

import java.util.Scanner;

public class Transpose_of_matrix {
    public static void main(String[] args) {
        int[][] arr = new int[100][100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r = scanner.nextInt();
        System.out.println("Enter number of cols : ");
        int c = scanner.nextInt();

        System.out.println("Enter elements : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Before Transpose : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] temp = new int[100][100];
        for(int i = 0; i < c ; i++){
            for (int j = 0 ; j < r ; j++){
                temp[j][i] = arr[i][j];
            }
        }
        System.out.println("After Transpose : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
