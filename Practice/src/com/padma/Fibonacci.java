package com.padma;

/**
 * Generates Fibonacci series using both iterative and recursive approaches.
 */
public class Fibonacci {
    public static void main(String... args) {

        int a = 0, b = 1, c;
        //  a,b,c,
        //0,1,1,2,3,5,8,13,21,34,55,89
        System.out.print(a + " , " + b);// 0 , 1
        for (int i = 1; i < 9; i++) { //11
            c = a + b;
            System.out.print(" , " + c); // ,1
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("Recursive");

        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
