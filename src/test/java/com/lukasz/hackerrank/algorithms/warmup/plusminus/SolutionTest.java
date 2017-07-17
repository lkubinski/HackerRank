package com.lukasz.hackerrank.algorithms.warmup.plusminus;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class SolutionTest {

    @Test
    public void exampleTest(){
        int n = 6;
        int[] array = {-4,3, -9, 0, 4, 1};

        Solution.calculateFraction(n, array);
    }

}