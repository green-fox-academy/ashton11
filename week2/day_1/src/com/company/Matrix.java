package com.company;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.print("\n");
        }

    }
}
