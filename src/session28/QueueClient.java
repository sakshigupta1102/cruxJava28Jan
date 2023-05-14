package session28;

import java.util.ArrayList;

public class QueueClient {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> l = new ArrayList<Integer>();
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		System.out.println(q);
	}
}
