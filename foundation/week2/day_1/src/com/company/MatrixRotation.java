package com.company;

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        // Create a function named `rotateMatrix` that takes an n×n integer matrix (array of arrays) as parameter
        // and returns a matrix which elements are rotated 90 degrees clockwise.
        //
        // example input:
        // [[1, 2, 3],
        // [4, 5, 6],
        // [7, 8, 9]]
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = rotateMatrix(matrix);

        Arrays.stream(rotatedMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));
        // should print
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
    }

    public static int[][] rotateMatrix(int[][] matrix){
        int rowLength = 3;
        int rowMin = 0;
        int rowMax = 2;
        int steps = 2;
        int[][] tempMatrix = new int[3][3];
        for (int i = 0; i < rowLength ; i++) {
            for (int j = 0; j < rowLength ; j++) {
                if (i==1 && j==1){
                    tempMatrix[i][j] = matrix[i][j];
                }else if (i==rowMin && j==rowMax || i==rowMax && j==rowMin){
                    tempMatrix[j][j] = matrix[i][j];
                }else if (i==rowMin && j==rowMin){
                    tempMatrix[i][i+steps] = matrix[i][j];
                }else if (i==rowMax && j==rowMax){
                    tempMatrix[i][j-steps] = matrix[i][j];
                }
            }
        }
        return tempMatrix;
    }
}
