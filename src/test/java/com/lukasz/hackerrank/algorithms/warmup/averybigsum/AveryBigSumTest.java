package com.lukasz.hackerrank.algorithms.warmup.averybigsum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 13/07/2017.
 */
public class AveryBigSumTest {

    @Test
    public void exampleTest(){
        //Given
        int N = 5;
        long[] numbers = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long expectedSum = 5000000015L;

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);

        //then
        assertEquals(expectedSum, sum);
    }

    @Test
    public void addingTwoMaxIntegers(){
        //Given
        int N = 2;
        long[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        long expectedSum = 4294967294L;

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);

        //then
        assertEquals(expectedSum, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkingUpperNumberRange(){
        //Given
        int N = 11;
        long[] numbers = {0, 1};

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkingLowerNumberRange(){
        //Given
        int N = 0;
        long[] numbers = {0, 1};

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkingUpperArrayRange(){
        //Given
        int N = 2;
        long[] numbers = {0, (long)Math.pow(10,10) + 1L};

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkingLowerArrayRange(){
        //Given
        int N = 2;
        long[] numbers = {-1, 1};

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkingIndexRange(){
        //Given
        int N = 3;
        long[] numbers = {-1, 1};

        //When
        long sum = AveryBigSum.aVeryBigSum(N, numbers);
    }

}