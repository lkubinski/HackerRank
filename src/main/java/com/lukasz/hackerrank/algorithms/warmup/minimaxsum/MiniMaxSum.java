package com.lukasz.hackerrank.algorithms.warmup.minimaxsum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lukasz on 15/07/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;
        for(int arr_i=0; arr_i < 5; arr_i++){
            temp = in.nextInt();
            if (temp < 1 || temp > (int)Math.pow(10,9)) throw new IllegalArgumentException();
            arr[arr_i] = temp;
        }
        getMinMaxValue(arr);
    }

    static void getMinMaxValue(int[] arr){
        long[] sum = new long[5];
        long tempSum ;
        for (int idx = 0; idx < arr.length; idx++) {
            tempSum  = 0;
            int i = 0;
            while(i < arr.length){
                if( i != idx){
                    tempSum += arr[i];
                }
                i++;
            }
            sum[idx] = tempSum;
        }
        Arrays.sort(sum);
        System.out.println(sum[0] + " " + sum[sum.length-1]);
    }

}
