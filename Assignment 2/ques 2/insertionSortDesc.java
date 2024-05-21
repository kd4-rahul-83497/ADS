package com.assignment.a2;

import java.util.Arrays;

public class insertionSortDesc {

        public static void insertionSort(int arr[], int N) {

            for(int i = 1 ; i < N ; i++) {

                int temp = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j] < temp) {
                    arr[j + 1] = arr[j];
                    j--;

                }
                arr[j + 1] = temp;
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            int arr[] = {55, 44, 22, 66, 11, 33};

            System.out.println("Before sort array : " + Arrays.toString(arr));
            insertionSort(arr, arr.length);
            System.out.println("After sort array : " + Arrays.toString(arr));
        }

    }


