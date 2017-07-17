package com.lukasz.hackerrank.algorithms.warmup.staircase;

import java.util.Scanner;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hight = in.nextInt();
        if (hight < 1) throw new IllegalArgumentException();
        printStairs(hight);
    }

    static void printStairs(int hight) {
        for (int row = 1; row <= hight; row++) {
            for (int column = 1; column <= hight; column++) {
                if ((hight-row) >= column){
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

}
