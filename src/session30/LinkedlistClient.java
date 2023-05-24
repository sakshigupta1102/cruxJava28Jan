package session30;

public class LinkedlistClient {
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
		ll.removefirst();
		ll.display();

	}
}
