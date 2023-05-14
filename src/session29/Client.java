package session29;

public class Client {
	public static void main(String[] args) {
		queueusingstack_dequeueeff queue = new queueusingstack_dequeueeff();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		queue.enqueue(50);
		queue.display();
		

	}
}
