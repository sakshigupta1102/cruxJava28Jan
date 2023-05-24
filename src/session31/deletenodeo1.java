package session31;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
public class deletenodeo1 {
	 
	class Solution {
	    public void deleteNode(ListNode node) {  
	        node.val = node.next.val;
	        node.next= node.next.next;     
	    }
	}
}
