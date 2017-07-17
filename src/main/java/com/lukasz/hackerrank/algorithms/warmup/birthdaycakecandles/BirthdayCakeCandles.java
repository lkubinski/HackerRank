package com.lukasz.hackerrank.algorithms.warmup.birthdaycakecandles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1 || n > (int) Math.pow(10,5)) throw new IllegalArgumentException();
        int[] ar = new int[n];
        int temp;
        for(int ar_i = 0; ar_i < n; ar_i++){
            temp = in.nextInt();
            if (temp < 1 || temp > (int) Math.pow(10,7)) throw new IllegalArgumentException();
            ar[ar_i] = temp;
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        if (n ==1) return 1;
        Arrays.sort(ar);
        int highestCandle = ar[n-1];
        int candelsQty = 1;
        for (int idx = n-2; idx >= 0 ; idx--) {
            if (ar[idx] == highestCandle){
                candelsQty++;
                continue;
            }
            break;
        }
        return candelsQty;
    }

}
