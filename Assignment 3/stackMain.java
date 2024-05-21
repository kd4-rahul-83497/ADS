package assignment.q1;

import java.util.Scanner;

public class stackMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		descStack Dst = new descStack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("0.Exit   1.Push   2.Pop   3.Peek  4.Display Stack");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(Dst.isFull())
					System.out.println("Stack is full");
				else {
					System.out.println("Enter value :");
					int value = sc.nextInt();
					Dst.push(value);
				}	
				break;
			case 2:
				if(Dst.isEmpty()) 
					System.out.println("Stack is empty");
				else
					System.out.println("Popped value = "+Dst.pop());
				break;
			case 3:
				if(Dst.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked value = "+Dst.peek());
				break;
			case 4:
				Dst.display();
				break;
			}
		}while(choice != 0);
		
	}

}
