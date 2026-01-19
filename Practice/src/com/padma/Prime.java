package com.padma;

public class Prime {
    public static void main(String Arg[]) {
        int num = 12;
        boolean flag = false;
        if (num == 0 || num == 1) {
            flag = true;
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Num is Prime");

        } else
            System.out.println(" not prime");
    }

}
