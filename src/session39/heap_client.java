package session39;
public class heap_client {
	public static void main(String[] args) {
		Heap pq = new Heap();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(90);
		pq.add(50);
		pq.display();
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}
