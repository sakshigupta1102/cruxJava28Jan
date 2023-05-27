package session32;

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
}
