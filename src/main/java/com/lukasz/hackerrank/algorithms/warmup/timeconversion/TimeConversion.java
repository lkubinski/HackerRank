package com.lukasz.hackerrank.algorithms.warmup.timeconversion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lukasz on 16/07/2017.
 */
public class TimeConversion {

    private final static String timePattern = "(?<hour>((^[0][0-9])|(^[1][0-2])))((?<minsec>(:[0-5][0-9]){2}))(?<period>(PM)|(AM))";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        validateTime(time);
        String result = timeConversion(time);
        System.out.println(result);
    }

    static void validateTime(String time) {
        if (!time.matches(timePattern)) throw new IllegalArgumentException();
    }

    static String timeConversion(String timeToConvert) {
        Pattern pattern = Pattern.compile(timePattern);
        Matcher m = pattern.matcher(timeToConvert);
        if (!m.find()) throw new IllegalArgumentException();

        String newHour = "";

        String period = m.group("period");
        String hour = m.group("hour");
        String minsec = m.group("minsec");

        if (hour.equals("12")){
            if (period.equals("AM")){
                newHour = "00";
            } else {
                newHour = "12";
            }
        } else {
            if (period.equals("PM")){
                newHour = String.format("%02d", Integer.valueOf(hour) + 12);
            } else {
                newHour = hour;
            }
        }
        return newHour + minsec;
    }

}
