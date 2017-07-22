package com.lukasz.hackerrank.algorithms.warmup.staircase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class StaircaseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        System.setOut( new PrintStream(outContent));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void exampleTest(){
        Staircase.printStairs(5);

        StringBuilder sb = new StringBuilder();
        sb.append("    #");
        sb.append(System.getProperty("line.separator"));
        sb.append("   ##");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ###");
        sb.append(System.getProperty("line.separator"));
        sb.append(" ####");
        sb.append(System.getProperty("line.separator"));
        sb.append("#####");
        sb.append(System.getProperty("line.separator"));

        assertEquals(sb.toString(), outContent.toString());
    }
}