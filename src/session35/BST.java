package session35;
public class BST {
	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	Node root;

	BST(int[] arr) {
		this.root = construct(0, arr.length - 1, arr);
	}

	private Node construct(int lo, int hi, int[] arr) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node nn = new Node(arr[mid]);
		nn.left = construct(lo, mid - 1, arr);
		nn.right = construct(mid + 1, hi, arr);
		return nn;
	}

	public void display(Node node) {
		String str = "";
		if (node == null)
			return;
		if (node.left != null) {
			str += node.left.val;
		} else {
			str += ".";
		}
		str += "<-" + node.val + "->";
		if (node.right != null) {
			str += node.right.val;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}
	public boolean find(int item){
		return find(item, root);
	}
	public boolean find(int item , Node node){
		if(node == null) return false;
		
		if(node.val > item){
			return find(item, node.left);
		}
		else if(node.val < item){
			return find(item, node.right);
		}
		else{
			return true;
		}
		
	}
	public int max(){
		return max(root);
	}
	public int max(Node node){
		if(node.right == null){
			return node.val;
		}
		return max(node.right);
	}
	public void printInRange(int lo,int hi){
		printInRange(lo, hi, root);
	}
	public void printInRange(int lo, int hi, Node node){
		if(node== null) return;
		if(node.val > hi){
			printInRange(lo, hi, node.left);
		}else if(node.val <lo){
			printInRange(lo, hi, node.right);
		}
		else{
			printInRange(lo, hi, node.left);
			System.out.println(node.val);
			printInRange(lo, hi, node.right);
		}
	}
	public void add(int val){
		 add(val, root);
	}
	public Node add(int val , Node node){
		if(node == null){
			Node nn = new Node(val);
			return nn;
		}
		if(node.val > val){
		 node.left = 	add(val, node.left);
		}
		else if(node.val < val){
		node.right = 	add(val, node.right);
		}
		return node;
		
	}

}

