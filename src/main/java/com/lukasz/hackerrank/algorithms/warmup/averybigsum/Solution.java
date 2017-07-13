package com.lukasz.hackerrank.algorithms.warmup.averybigsum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long aVeryBigSum(int n, long[] ar) {
        validateSize(n);
        validateArray(ar);
        long sum = 0L;
        for (int idx = 0; idx < n; idx++){
            sum += ar[idx];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

    private static void validateSize(int n) {
        if (n < 1 || n > 10) throw new IllegalArgumentException();
    }

    private static void validateArray(long[] ar) {
        for (int idx = 0; idx < ar.length; idx++) {
            if (ar[idx] < 0 || ar[idx] > Math.pow(10,10)) throw new IllegalArgumentException();
        }
    }

}