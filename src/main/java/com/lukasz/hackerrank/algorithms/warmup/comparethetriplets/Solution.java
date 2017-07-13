package com.lukasz.hackerrank.algorithms.warmup.comparethetriplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int aliceResult = 0, bobResult = 0;
        int[] alice = {a0, a1, a2};
        int[] bob = {b0, b1, b2};
        int[] result = new int[2];

        validate(alice);
        validate(bob);

        for (int i = 0; i < 3; i++) {
            if(alice[i] > bob[i]){
                aliceResult++;
            } else if (alice[i] < bob[i]){
                bobResult++;
            }
        }
        result[0] = aliceResult;
        result[1] = bobResult;
        return result;
    }

    private static void validate(int[] person) {
        for (int i = 0; i < person.length; i++) {
            if (person[i] < 1 || person[i] > 100 )
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
