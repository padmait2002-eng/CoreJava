package com.padma;

import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        int count;
        System.out.println("Enter number count:");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        float avg = 0;
        for (int i = 0; i < count; i++) {
            number = sc.nextInt();
            sum = sum + number;
        }
        avg = sum / count;
        System.out.println("Sum of the numbers:" + sum);

        System.out.print("Average of entered numbers;" + avg);

    }

}



