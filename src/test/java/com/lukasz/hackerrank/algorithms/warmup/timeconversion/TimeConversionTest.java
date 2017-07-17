package com.lukasz.hackerrank.algorithms.warmup.timeconversion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 16/07/2017.
 */
public class TimeConversionTest {

    @Test
    public void exampleTest() {
        // Given
        String time = "07:05:45PM";
        String expected = "19:05:45";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void  checkMidnight(){
        // Given
        String time = "12:00:00AM";
        String expected = "00:00:00";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void  checkNoon(){
        // Given
        String time = "12:00:00PM";
        String expected = "12:00:00";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void  checkBeforeNoon(){
        // Given
        String time = "11:29:00PM";
        String expected = "23:29:00";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void checkLateEvening(){
        // Given
        String time = "09:25:33PM";
        String expected = "21:25:33";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void checkEarlyMorning(){
        // Given
        String time = "08:29:00AM";
        String expected = "08:29:00";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void checkAfterMidnight(){
        // Given
        String time = "12:25:33AM";
        String expected = "00:25:33";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }

    @Test
    public void checjAfterNoon(){
        // Given
        String time = "12:25:33PM";
        String expected = "12:25:33";

        // When
        String convertedTime = TimeConversion.timeConversion(time);

        // Then
        assertEquals(expected, convertedTime);
    }



    @Test(expected = IllegalArgumentException.class)
    public void wrongAMFormat(){
        String time = "13:05:45AM";
        TimeConversion.validateTime(time);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongPMFormat(){
        String time = "13:05:45PM";
        TimeConversion.validateTime(time);
    }
}