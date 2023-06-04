package session35;
public class BSTclient {
	public static void main(String[] args) {
		int[] arr = { 35, 40, 45, 50, 55, 60, 65 };
		BST tree = new BST(arr);
		tree.display(tree.root);
		System.out.println(tree.max());
		System.out.println(tree.find(55));
		tree.printInRange(38, 62);
		tree.add(52);
		System.out.println("****************");
		tree.display(tree.root);
	}
}
