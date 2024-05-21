package com.assignment.a7;

import java.util.ArrayList;

class MinHeapPriorityQueue {
    private ArrayList<Integer> heap;

    public MinHeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private void heapifyUp(int index) {
        int parentIndex;
        while (index > 0 && heap.get(index) < heap.get(parentIndex = (index - 1) / 2)) {
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (true) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
                smallest = leftChild;
            }
            if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
                smallest = rightChild;
            }

            if (smallest == index) {
                break;
            }
            swap(index, smallest);
            index = smallest;
        }
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public Integer extractMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty. Cannot extract min.");
            return null; // or return a specific value like Integer.MIN_VALUE
        }

        int min = heap.get(0);
        int lastValue = heap.get(heap.size() - 1);
        heap.set(0, lastValue);
        heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heapifyDown(0);
        }

        return min;
    }

    public Integer getMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty. Cannot get min.");
            return null; // or return a specific value like Integer.MIN_VALUE
        }
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue minHeap = new MinHeapPriorityQueue();
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(15);

        System.out.println("Min value: " + minHeap.getMin());
        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Min value: " + minHeap.getMin());
        minHeap.insert(5);
        minHeap.insert(4);
        minHeap.insert(45);

        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Min value: " + minHeap.getMin());

        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Extract Min: " + minHeap.extractMin());
    }
}
