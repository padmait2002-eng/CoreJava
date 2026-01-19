package com.padma;

/**
 * Calculates the sum and average of an integer array.
 */
public class ArraySumAvg {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int length = arr.length;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / length;
        }
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);


    }

}
