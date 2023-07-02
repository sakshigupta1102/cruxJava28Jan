package session39;

import java.util.PriorityQueue;

public class PriorityQueue_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add(20);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}
}
