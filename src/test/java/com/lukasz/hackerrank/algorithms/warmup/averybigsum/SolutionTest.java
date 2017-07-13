package com.lukasz.hackerrank.algorithms.warmup.averybigsum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 13/07/2017.
 */
public class SolutionTest {

    @Test
    public void exampleTest(){
        //Given
        int N = 5;
        long[] numbers = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long expectedSum = 5000000015L;

        //When
        long sum = Solution.aVeryBigSum(N, numbers);

        //then
        assertEquals(expectedSum, sum);
    }

}