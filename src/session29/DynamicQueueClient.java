package session29;
public class DynamicQueueClient {
	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.dequeue();
		dq.enqueue(60);
		dq.enqueue(56);
		dq.display();

	}
}
