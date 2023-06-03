package session32;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	Scanner scan;
	private Node root;

	public BinaryTree(String str) {
		scan = new Scanner(str);
		this.root = construct();
	}

	public Node construct() {
		int item = scan.nextInt();
		Node nn = new Node(item);
		boolean ilc = scan.nextBoolean();
		if (ilc) {
			nn.left = construct();
		}
		boolean irc = scan.nextBoolean();
		if (irc) {
			nn.right = construct();
		}
		return nn;

	}

	public void display() {
		display(root);
	}

	public void display(Node node) {
		String str = "";
		if (node == null)
			return;
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<-" + node.data + "->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	public int size(Node node) {
		if (node == null)
			return 0;
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;
	}

	public int max() {
		return max(root);
	}

	public int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	public boolean find(Node node, int item) {
		if (node == null)
			return false;
		if (node.data == item)
			return true;
		boolean isInLeft = find(node.left, item);
		boolean isInRight = find(node.right, item);
		return isInLeft || isInRight;
	}

	public int height() {
		return height(root);
	}

	public int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;

	}
	
	
	
	
	
	
	
	

	public void preorder() {
		preorder(root);
	}

	public void preorder(Node node) {
		if (node == null)
			return;
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
	}

	public void postorder() {
		postorder(root);
	}

	public void postorder(Node node) {
		if (node == null)
			return;

		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}

	public void LevelOrder() {
		levelorder(root);
	}

	public void levelorder(Node node) {
		LinkedList<Node> queue = new LinkedList();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node cn = queue.remove();
			System.out.println(cn.data);
			if (cn.left != null)
				queue.add(cn.left);
			if (cn.right != null)
				queue.add(cn.right);
		}
	}

	public void LevelOrderNextLine(Node node) {
		LinkedList<Node> queue = new LinkedList();
		queue.addLast(node);
		queue.addLast(null);
		while (!queue.isEmpty()) {
			Node currnode = queue.removeFirst();
			if (currnode != null) {
				System.out.print(currnode.data + " ");
				if (currnode.left != null)
					queue.addLast(currnode.left);
				if (currnode.right != null)
					queue.addLast(currnode.right);
			} else if (currnode == null && queue.size() != 0) {
				System.out.println();
				queue.addLast(null);
			}
		}

	}

}
