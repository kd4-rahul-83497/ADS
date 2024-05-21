package com.assignment.a4;

import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }

        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(array);

        System.out.println("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

