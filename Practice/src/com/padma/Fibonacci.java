package com.padma;

/**
 * Generates Fibonacci series using both iterative and recursive approaches.
 */
public class Fibonacci {
    public static void main(String... args) {
        int n = 10; // Number of terms to display

        System.out.println("Iterative approach:");
        printFibonacciIterative(n);

        System.out.println("\n------------------");
        System.out.println("Recursive approach:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    private static void printFibonacciIterative(int count) {
        int a = 0, b = 1;
        if (count >= 1) System.out.print(a);
        if (count >= 2) System.out.print(" , " + b);

        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(" , " + c);
            a = b;
            b = c;
        }
    }

    static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
