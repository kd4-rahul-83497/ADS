package com.assignment.a2;

import java.util.Arrays;

public class Queue {
    private int arr[];
    private int front, rear;
    private final int SIZE;
    public Queue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = 0;
    }

    public void push(int value) {
        //2. add value at rear index
        arr[rear] = value;
        //1. reposition rear
        rear++;

    }

    public int pop() {
        //1. reposition front
        return arr[front++];
    }

    public int peek() {
        //1. read and return data from front end
        return arr[front + 1];
    }

    public boolean isFull() {
        return rear == SIZE;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
