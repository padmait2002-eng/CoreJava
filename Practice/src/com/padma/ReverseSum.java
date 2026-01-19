package com.padma;

import java.util.Scanner;

/**
 * Calculates the sum of digits of a number entered by the user.
 */
public class ReverseSum {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            //revNumber = revNumber + number;

            sum = sum + lastDigit;

        }
        System.out.println("Sum:" + sum);

    }

}
