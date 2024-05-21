package com.assignment.a4;

import java.util.Scanner;

public class SingleLinkedListMenu {
    public static class SinglyLinkedList {
        class Node {
            int data;
            SingleLinkedListMenu.SinglyLinkedList.Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private SingleLinkedListMenu.SinglyLinkedList.Node head;
        private SingleLinkedListMenu.SinglyLinkedList.Node tail;

        public SinglyLinkedList() {
            head = null;
            tail = null;
        }

        public void addFirst(int data) {
            SingleLinkedListMenu.SinglyLinkedList.Node newNode = new SingleLinkedListMenu.SinglyLinkedList.Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void addLast(int data) {
            SingleLinkedListMenu.SinglyLinkedList.Node newNode = new SingleLinkedListMenu.SinglyLinkedList.Node(data);
            if (tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void delFirst() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
        }

        public void delLast() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                if (head == tail) {
                    head = tail = null;
                } else {
                    SingleLinkedListMenu.SinglyLinkedList.Node current = head;
                    while (current.next != tail) {
                        current = current.next;
                    }
                    current.next = null;
                    tail = current;
                }
            }
        }

        public void displayReverse() {
            displayReverseUtil(head);
            System.out.println();
        }

        private void displayReverseUtil(SingleLinkedListMenu.SinglyLinkedList.Node node) {
            if (node == null) {
                return;
            }
            displayReverseUtil(node.next);
            System.out.print(node.data + " ");
        }

        public void insertSorted(int data) {
            SingleLinkedListMenu.SinglyLinkedList.Node newNode = new SingleLinkedListMenu.SinglyLinkedList.Node(data);
            if (head == null || head.data >= data) {
                newNode.next = head;
                head = newNode;
            } else {
                SingleLinkedListMenu.SinglyLinkedList.Node current = head;
                while (current.next != null && current.next.data < data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            if (newNode.next == null) {
                tail = newNode;
            }
        }

        public void insertAfter(SingleLinkedListMenu.SinglyLinkedList.Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Previous node cannot be null");
                return;
            }
            SingleLinkedListMenu.SinglyLinkedList.Node newNode = new SingleLinkedListMenu.SinglyLinkedList.Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            if (prevNode == tail) {
                tail = newNode;
            }
        }

        public void insertBefore(SingleLinkedListMenu.SinglyLinkedList.Node nextNode, int data) {
            if (nextNode == null || head == null) {
                System.out.println("Next node cannot be null or list is empty");
                return;
            }
            if (nextNode == head) {
                addFirst(data);
                return;
            }
            SingleLinkedListMenu.SinglyLinkedList.Node current = head;
            while (current != null && current.next != nextNode) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Next node not found");
                return;
            }
            SingleLinkedListMenu.SinglyLinkedList.Node newNode = new SingleLinkedListMenu.SinglyLinkedList.Node(data);
            newNode.next = nextNode;
            current.next = newNode;
        }

        public void display() {
            SingleLinkedListMenu.SinglyLinkedList.Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Display");
            System.out.println("6. Display Reverse");
            System.out.println("7. Insert After");
            System.out.println("8. Insert Before");
            System.out.println("9. Insert Sorted");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int addFirstValue = scanner.nextInt();
                    list.addFirst(addFirstValue);
                    break;
                case 2:
                    System.out.print("Enter value to add: ");
                    int addLastValue = scanner.nextInt();
                    list.addLast(addLastValue);
                    break;
                case 3:
                    list.delFirst();
                    break;
                case 4:
                    list.delLast();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    list.displayReverse();
                    break;
                case 7:
                    System.out.print("Enter value to insert after: ");
                    int afterValue = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int insertValueAfter = scanner.nextInt();
                    list.insertAfter(findNode(list.head, afterValue), insertValueAfter);
                    break;
                case 8:
                    System.out.print("Enter value to insert before: ");
                    int beforeValue = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int insertValueBefore = scanner.nextInt();
                    list.insertBefore(findNode(list.head, beforeValue), insertValueBefore);
                    break;
                case 9:
                    System.out.print("Enter value to insert sorted: ");
                    int sortedValue = scanner.nextInt();
                    list.insertSorted(sortedValue);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static SinglyLinkedList.Node findNode(SinglyLinkedList.Node head, int value) {
        SinglyLinkedList.Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;

            }
            current = current.next;
        }
        return null;
    }

}
