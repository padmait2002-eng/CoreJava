package com.padma;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num;
       // System.out.println("Enter the num:");

       // Scanner sc = new Scanner(System.in);
       // num = sc.nextInt();
        num= Integer.parseInt(args[0]);
        int result = factorial(num);
        System.out.println("Factorial of " + num + ": " + result);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}
