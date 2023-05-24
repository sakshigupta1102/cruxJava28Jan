package session31;

public class reverselinkedlist {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode save = curr.next;
			curr.next = prev;
			prev = curr;
			curr = save;

		}
		return prev;

	}
}
