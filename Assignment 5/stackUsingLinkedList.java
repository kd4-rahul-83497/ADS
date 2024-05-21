package com.assignment.a5;

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private StackNode top;

    Stack() {
        top = null;
    }

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    void printStack() {
        StackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class stackUsingLinkedList {


}
