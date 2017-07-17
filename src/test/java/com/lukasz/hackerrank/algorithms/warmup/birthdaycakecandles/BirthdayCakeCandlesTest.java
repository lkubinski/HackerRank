package com.lukasz.hackerrank.algorithms.warmup.birthdaycakecandles;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class BirthdayCakeCandlesTest {

    @Test
    public void exampleTest(){
        int n= 4;
        int[] candles = {3,2,1,3};

        int expected = 2;

        int bloweddUpCandles = BirthdayCakeCandles.birthdayCakeCandles(n,candles);

        assertEquals(expected, bloweddUpCandles);
    }

    @Test
    public void exampleTwo(){
        int n= 4;
        int[] candles = {3,3,3,3};

        int expected = 4;

        int bloweddUpCandles = BirthdayCakeCandles.birthdayCakeCandles(n,candles);

        assertEquals(expected, bloweddUpCandles);
    }

}