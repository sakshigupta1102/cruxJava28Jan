package session31;

// Definition for singly-linked list.
 class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class oddevenlinkedlist {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenhead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenhead;
		return head;

	}
}
