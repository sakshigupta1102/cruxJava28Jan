package session28;
public class Queue {
	int[] data;
	int size = 0;
	int front = 0;
	public Queue() {
		this.data = new int[5];
	}
	public Queue(int cap) {
		this.data = new int[cap];
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == this.data.length;
	}
	
	
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("the queue is full");
		}
		this.data[(this.front + this.size) % this.data.length] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("the queue is empty");
		}
		int val = this.data[front];
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return val;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("the queue is empty");
		}
		return this.data[front];
	}

	public void display() {

		for (int i = 0; i < this.size; i++) {
			System.out.println(this.data[(front + i) % this.data.length]);
		}
}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.size; i++) {
			sb.append((this.data[(front + i) % this.data.length]));
			sb.append(" ");
		}
		return sb.toString();
	}
	
	

}
