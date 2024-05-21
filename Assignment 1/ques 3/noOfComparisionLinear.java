package com.assignment.a1;

import java.util.Scanner;

public class noOfComparisionLinear {

    public static int linearSearch(int arr[], int N, int key) {
int comp=0;
        for (int i = 0; i < N; i++) {
            comp++;
            if (key == arr[i]){

            System.out.println("comparisions = " + comp);
                return i;
            }

        }

        return -1;
    }
    public static void main(String[] args) {

        int arr[] = { 88,33, 66, 99, 11, 77, 22, 55, 14 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();

        int index = linearSearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("Key is found at index " + index);
        else
            System.out.println("Key is not found");

        sc.close();
    }


}