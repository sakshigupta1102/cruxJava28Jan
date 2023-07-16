package session27;
public class Stack {
	public  int[] data;
	 public int top = 0;
	public Stack() {
		this.data = new int[5];
	}
	public Stack(int cap) {
		this.data = new int[cap];
	}
	public boolean isEmpty() {
		return top == 0;
	}
	public boolean isFull() {
		return this.top == this.data.length;
	}
	public void push(int item) throws Exception {
		if (isFull())
			throw new Exception("stack is full");
		this.data[this.top] = item;
		this.top++;
	}
	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("stack is empty");
		this.top--;
		return this.data[top];
	}
	public int peek() throws Exception {
		if (isEmpty())
			throw new Exception("stack is empty");
		return this.data[top - 1];
	}

	public int size() {
		return this.top;
	}
	public void display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.data[i] + "  ");
		}
	}
}
