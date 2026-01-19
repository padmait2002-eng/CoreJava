package com.padma;

/**
 * Checks if a number passed as a command-line argument is prime.
 */
public class Prime {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            return;
        }

        boolean isPrime = isPrime(num);
        
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
