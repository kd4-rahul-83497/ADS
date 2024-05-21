package com.assignment.a5;
class DequeNode {
    int data;
    DequeNode next, prev;

    DequeNode(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Deque {
    private DequeNode head, tail;

    Deque() {
        head = tail = null;
    }

    void addFirst(int data) {
        DequeNode newNode = new DequeNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int data) {
        DequeNode newNode = new DequeNode(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    int removeFirst() {
        if (head == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        return data;
    }

    int removeLast() {
        if (tail == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        return data;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printDeque() {
        DequeNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class dequeUsingDLL {
}
