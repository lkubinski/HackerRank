package com.lukasz.hackerrank.algorithms.warmup.plusminus;

import java.util.Scanner;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int idx = 0; idx < n; idx++) {
            array[idx] = in.nextInt();
        }
        calculateFraction(n, array);
    }

    static void calculateFraction(int n, int[] array){
        int positiveQty =0, negativeQty = 0, zeroQty = 0;
        for (int idx = 0; idx < n; idx++) {
            if (array[idx] > 0) {
                positiveQty++;
            } else if (array[idx] < 0){
                negativeQty++;
            } else {
                zeroQty++;
            }
        }
        System.out.println(positiveQty / (float)n );
        System.out.println(negativeQty / (float) n );
        System.out.println(zeroQty / (float) n );
    }
}
