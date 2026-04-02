package com.padma.evennumber;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList();
        int[] result = new int[10];
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0,j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
                result[j] = arr[i];
                j++;
            }
        }

        // Print values from list
        System.out.println("Even numbers from list: ");
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
