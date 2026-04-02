package com.padma;

/**
 * Calculates the sum and average of an integer array.
 */
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int sum = calculateSum(arr);
        double avg = calculateAverage(sum, arr.length);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static double calculateAverage(int sum, int length) {
        if (length == 0) return 0;
        return (double) sum / length;
    }
}
