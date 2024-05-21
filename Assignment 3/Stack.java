package assignment.q5;

public class Stack {
	
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int sIZE) {
		super();
		SIZE = sIZE;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value) {
		top++;
		arr[top] = value;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE - 1;
	}

}
