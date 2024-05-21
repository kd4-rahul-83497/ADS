package com.assignment.a1;
import java.util.Scanner;

public class noOfComparisionBinary {
    public static int binarySearch(int[] arr, int N, int key) {
        int left = 0, right = N - 1, mid;
        int comp = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                comp++;
                System.out.println("comparisions = " + comp);
                return mid;
            } else if (key < arr[mid]) {
                comp++;
                right = mid - 1;
            } else {
                comp++;
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();
        int index = binarySearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("Key is found at index " + index);
        else
            System.out.println("Key is not found");
        sc.close();
    }
}