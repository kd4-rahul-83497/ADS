package com.assignment.a7;

import java.util.Arrays;

public class MinHeapSort {

    // Function to heapify a subtree rooted with node i which is an index in arr[].
    private static void minHeapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, n, smallest);
        }
    }

    // Swap helper function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to sort an array using heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build min heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }

        // One by one extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            minHeapify(arr, i, 0);
        }
    }

    // A utility function to print array
    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Unsorted array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
