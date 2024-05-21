package com.assignment.a1;
import java.util.Scanner;

public class nthOccranceLinear {
    public static int linearSearch(int arr[], int N, int key) {

        int count=0;
        for (int i = 0; i < N; i++) {
            if (key == arr[i])
                count++;

        }
        if (count==0)
            return -1;

        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 88, 11,33,22,22, 66, 99,22, 11, 77, 22, 55, 14 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();
        int count = linearSearch(arr, arr.length, key);
        if (count != -1)
            System.out.println("count " + count +" times");
        else
            System.out.println("Key is not found");
        sc.close();
    }
}