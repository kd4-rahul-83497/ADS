package com.assignment.a1;
import java.util.Scanner;

public class lastOccuranceLinear {
    public static int linearSearch(int arr[], int N, int key) {
        int index =-1;
        for (int i = 0; i < N; i++) {
            if (key == arr[i])
                index=i;
        }
        return index;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 88, 11,33, 66, 99, 11, 77, 22, 55, 14 };
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