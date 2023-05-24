package session31;

public class nthfromlast {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode a = head;
		ListNode b = head;
		if (head == null)
			return null;
		if (head.next == null && n == 1)
			return null;
		for (int i = 0; i < n; i++) {
			b = b.next;
		}

		if (b == null)
			return head.next;
		while (b.next != null) {
			a = a.next;
			b = b.next;
		}
		a.next = a.next.next;
		return head;

	}
}
