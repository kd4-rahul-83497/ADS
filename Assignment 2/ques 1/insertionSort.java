package com.assignment.a2;
import java.util.*;

public class insertionSort {
    public static void insertionSort(int arr[], int N) {
        int comparision=0;
        int passes=0;
        for(int i = 1 ; i < N ; i++) {
            passes++;
          int temp = arr[i];
           int j = i - 1;
            while(j >= 0 && arr[j] > temp) {
               arr[j + 1] = arr[j];
                j--;
                comparision++;
            }
            arr[j + 1] = temp;
        }
        System.out.println("comparision : "+comparision);
        System.out.println("passes : "+passes);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {55, 44, 22, 66, 11, 33};

        System.out.println("Before sort array : " + Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println("After sort array : " + Arrays.toString(arr));
    }

}
