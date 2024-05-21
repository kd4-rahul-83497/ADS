package assignment.q4;

class circularQueue{
	private int queue[];
	private int front;
	private int rear;
	private int size;
	private int capacity;
	public circularQueue(int capacity) {
		super();
		this.capacity = capacity;
		queue = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public int size() {
		return size;
	}
	
	public void push(int value) {
		rear = (rear + 1)% capacity;
		queue[rear] = value;
		size++;
	}
	
	public int pop() {
		int value = queue[front];
		front = (front + 1)% capacity;
		size--;
		return value;
	}
	
	public int peek() {
		return queue[front];
	}
	
	
}


class CircularQueue {
	
	

	public static void main(String[] args) {
		
		circularQueue q = new circularQueue(5);
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(50);
		q.push(60);
		
		 System.out.println("Dequeue: " + q.pop());
	        System.out.println("Dequeue: " + q.pop());
	        System.out.println("Peek: " + q.peek());
	        System.out.println("Size: " + q.size());
	}

}
