package com.assignment.a2;
import java.util.Scanner;

public class LinearQueueMain {

    public static void main(String[] args) {

        Queue q = new Queue(4);
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek \n4. Display");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    if(q.isFull())
                        System.out.println("Queue is full");
                    else {
                        System.out.print("Enter value : ");
                        int value = sc.nextInt();
                        q.push(value);
                    }
                    break;
                case 2:
                    if(q.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Popped value : " + q.pop());
                    break;
                case 3:
                    if(q.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Peeked value : " + q.peek());
                    break;
                case 4:
                    if(q.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println(q.toString());
                    break;
            }
        }while(choice != 0);
        sc.close();
    }

}
