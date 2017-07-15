package com.lukasz.hackerrank.algorithms.warmup.diagonaldifference;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dimension = in.nextInt();
        if (dimension <= 0) throw new IllegalArgumentException();
        int[][] matrix = new int[dimension][dimension];
        int element;
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                element = in.nextInt();
                if (element >= -100 && element <= 100)
                    matrix[row][column] = element;
            }
        }
        System.out.println(calculateDiagonalDifference(dimension, matrix));
    }

    static long calculateDiagonalDifference(int dimension, int[][] matrix) {
        long firstDiagonal = 0L, secondDiagonal = 0L;

        for (int coordinate = 0; coordinate < dimension; coordinate++) {
            firstDiagonal += matrix[coordinate][coordinate];
            secondDiagonal += matrix[coordinate][dimension-coordinate -1];
        }

        return Math.abs(firstDiagonal - secondDiagonal);
    }
}
