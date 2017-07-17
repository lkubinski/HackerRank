package com.lukasz.hackerrank.algorithms.warmup.comparethetriplets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 06/07/2017.
 */
public class CompareTheTripletsTest {

    @Test
    public void shouldReturnDraw() {
        //given
        int[] alice = {5,6,7};
        int[] bob = {3,6,10};

        int[] expected = {1,1};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void aliceShouldWin() {
        //given
        int[] alice = {5,9,17};
        int[] bob = {3,6,10};

        int[] expected = {3,0};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void bobShouldWin() {
        //given
        int[] alice = {5,6,7};
        int[] bob = {9,6,10};

        int[] expected = {0,2};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnAllZeros() {
        //given
        int[] alice = {5,6,7};
        int[] bob = {5,6,7};

        int[] expected = {0,0};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);

        //then
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenInputIsOutOfRange() {
        //given
        int[] alice = {5,6,120};
        int[] bob = {3,6,10};

        int[] expected = {1,1};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);
    }

    @Test
    public void shouldNotThrowExceptionForCornerCase() {
        //given
        int[] alice = {1,100,1};
        int[] bob = {1,100,1};

        int[] expected = {0,0};

        //when
        int[] result = CompareTheTriplets.solve(alice[0], alice[1], alice[2], bob[0], bob[1], bob[2]);

        //then
        assertArrayEquals(expected, result);
    }
}