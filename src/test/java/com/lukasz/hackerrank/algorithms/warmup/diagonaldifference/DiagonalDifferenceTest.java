package com.lukasz.hackerrank.algorithms.warmup.diagonaldifference;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class DiagonalDifferenceTest {

    @Test
    public void exampleTest(){
        // Given
        int dimension = 3;
        int[][] matrix = {{11,2,4}, {4,5,6}, {10,8,-12}};

        // When
        long expected = 15L;

        // Then
        long diagonalDifference = DiagonalDifference.calculateDiagonalDifference(dimension, matrix);
        assertEquals(expected, diagonalDifference);
    }

    @Test
    public void twoDimensionMatrixTest(){
        // Given
        int dimension = 2;
        int[][] matrix = {{11,4}, {10,8}};

        // When
        long expected = 5L;

        // Then
        long diagonalDifference = DiagonalDifference.calculateDiagonalDifference(dimension, matrix);
        assertEquals(expected, diagonalDifference);
    }

}