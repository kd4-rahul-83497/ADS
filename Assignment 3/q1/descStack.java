package assignment.q1;

public class descStack {
	
	private int arr[];
	private int top;
	private final int SIZE;
	public descStack(int sIZE) {
		super();
		SIZE = sIZE;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int value) {
		--top;
		arr[top] = value;
	}
	
	public int pop() {
		return arr[top++];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack empty");
		}
		else {
			for(int i = top; i < SIZE; i--) {
				System.out.println(arr[i]);
			}
		}
	}
}
