package com.assignment.a4;

class DescendingStack {
    private static final int SIZE = 5;
    private int[] stack;
    private int top;
    private int maxTop;

    public DescendingStack() {
        stack = new int[SIZE];
        top = SIZE;
        maxTop = Integer.MIN_VALUE;
    }

    public void push(int value) {
        if (top == 0) {
            System.out.println("Stack overflow");
            return;
        }
        stack[--top] = value;
        if (value > maxTop) {
            maxTop = value;
        }
    }

    public int pop() {
        if (top == SIZE) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = stack[top++];
        if (value == maxTop) {
            maxTop = findMax();
        }
        return value;
    }

    public int getMax() {
        return maxTop;
    }

    private int findMax() {
        int max = Integer.MIN_VALUE;
        for (int i = top; i < SIZE; i++) {
            if (stack[i] > max) {
                max = stack[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        DescendingStack stack = new DescendingStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Maximum value in the stack: " + stack.getMax());
    }
}
