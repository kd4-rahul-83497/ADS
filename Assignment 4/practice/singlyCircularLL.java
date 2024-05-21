package com.assignment.a4;

public class singlyCircularLL {

    public static class CircularLinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node tail;

        public CircularLinkedList() {
            tail = null;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = newNode;
                tail.next = newNode;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = newNode;
                tail.next = newNode;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void deleteFirst() {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }
            if (tail.next == tail) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
        }

        public void deleteLast() {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }
            if (tail.next == tail) {
                tail = null;
            } else {
                Node current = tail.next;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = tail.next;
                tail = current;
            }
        }

        public void deletePosition(int position) {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }
            if (position <= 0) {
                System.out.println("Invalid position");
                return;
            }
            if (position == 1) {
                deleteFirst();
                return;
            }
            Node current = tail.next;
            int count = 1;
            while (count < position - 1 && current != tail) {
                current = current.next;
                count++;
            }
            if (current == tail) {
                System.out.println("Position exceeds list length");
                return;
            }
            current.next = current.next.next;
        }

        public void addPosition(int data, int position) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = newNode;
                tail.next = newNode;
            } else {
                if (position <= 0) {
                    System.out.println("Invalid position");
                    return;
                }
                if (position == 1) {
                    newNode.next = tail.next;
                    tail.next = newNode;
                    return;
                }
                Node current = tail.next;
                int count = 1;
                while (count < position - 1 && current != tail) {
                    current = current.next;
                    count++;
                }
                if (current == tail) {
                    System.out.println("Position exceeds list length");
                    return;
                }
                newNode.next = current.next;
                current.next = newNode;
                if (current == tail) {
                    tail = newNode;
                }
            }
        }

        public void display() {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }
            Node current = tail.next;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != tail.next);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList l1 = new CircularLinkedList();

        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);
        //10 -> 20 -> 30 -> 40

        l1.addLast(50);
        l1.addLast(60);
        //10 -> 20 -> 30 -> 40 -> 50 -> 60

       // l1.deleteFirst();
        //20 -> 30 -> 40 -> 50 -> 60
//        l1.deleteLast();
        //10 -> 20 -> 30 -> 40 -> 50

//        l1.addPosition(100, 8);
        //nochange --> Position exceeds list length

//        l1.deletePosition(7);
//        l1.display();
    }
}
