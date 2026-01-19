package com.padma;

import java.util.Scanner;

/**
 * Calculates the sum and average of a series of numbers entered by the user.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number count:");
        int count = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = sc.nextInt();
            sum += number;
        }
        
        double avg = (double) sum / count;
        
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of entered numbers: " + avg);
        
        sc.close();
    }
}
