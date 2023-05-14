package session29;

public class reversequeue {
	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q);
		System.out.println("*******************");
		reverse(q);
		System.out.println(q);
	}

	public static void reverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int item = q.dequeue();
		reverse(q);
		q.enqueue(item);

	}
}
