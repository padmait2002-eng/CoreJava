package com.padma;

import java.util.Scanner;

/**
 * Calculates the factorial of a number passed as a command-line argument.
 */
public class Factorial {

    public static void main(String[] args) {
        int num;
        
        if (args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Please enter a valid integer.");
                return;
            }
        } else {
            System.out.println("Enter the num:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            sc.close();
        }

        long result = factorial(num);
        System.out.println("Factorial of " + num + ": " + result);
    }

    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
