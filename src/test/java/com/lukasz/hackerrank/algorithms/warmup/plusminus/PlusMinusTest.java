package com.lukasz.hackerrank.algorithms.warmup.plusminus;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class PlusMinusTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void exampleTest(){
        int n = 6;
        int[] array = {-4,3, -9, 0, 4, 1};


        StringBuilder sb = new StringBuilder();
        sb.append("0.5");
        sb.append(System.getProperty("line.separator"));
        sb.append("0.33333334");
        sb.append(System.getProperty("line.separator"));
        sb.append("0.16666667");
        sb.append(System.getProperty("line.separator"));

        PlusMinus.calculateFraction(n, array);

        assertEquals(sb.toString(), outContent.toString());
    }

}