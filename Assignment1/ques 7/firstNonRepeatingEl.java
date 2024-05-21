package com.assignment.a1;

import java.util.Scanner;

public class firstNonRepeatingEl {
    public static int nonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println("non repeating ones ");
        int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
        int index = nonRepeating(arr);
        System.out.println(index);
    }
}
