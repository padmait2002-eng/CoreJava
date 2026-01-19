package com.padma;

import java.util.Scanner;

/**
 * Calculates the sum of digits of a number entered by the user.
 */
public class ReverseSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        
        int number = sc.nextInt();
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
}
