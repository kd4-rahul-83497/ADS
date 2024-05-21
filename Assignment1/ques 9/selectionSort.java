package com.assignment.a1;

import java.util.*;

public class selectionSort {
          public static void selectionSortComp(int arr[], int N) {
              int comp=0,passes=0;
            for(int i = 0 ; i < N-1 ; i++) {
                passes++;
                for(int j = i + 1 ; j < N ; j++) {
                    comp++;

                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
              System.out.println("comparisions : "+comp);
              System.out.println("passes : "+passes);
        }

        public static void main(String[] args) {
            int arr[] = {44, 11, 55, 22, 66, 33};

            System.out.println("Array before sort : " + Arrays.toString(arr));
            selectionSortComp(arr, arr.length);
            System.out.println("Array after sort : " + Arrays.toString(arr));
        }

    }
