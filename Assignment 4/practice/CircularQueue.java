package com.assignment.a4;
class CircularQueue {
    private int[] queue;
    private int front, rear, size, count;
    private static final int CAPACITY = 5;

    public CircularQueue() {
        queue = new int[CAPACITY];
        front = rear = count = 0;
        size = CAPACITY;
    }

    public void enqueue(int value) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % size;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % size;
        count++;
        return value;
    }

    public void printQueue() {
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

        queue.enqueue(6);
        queue.enqueue(7);

        queue.printQueue();
    }
}

