package session32;

public class btclient {
public static void main(String[] args) {
	String str = "10 true 20 true 40 false false true 50 false false true"
			+ " 30 false true 60 true 70 false false false";
	BinaryTree tree = new BinaryTree(str);
//	tree.display();
//	System.out.println(tree.size());
//	System.out.println(tree.max());
//	System.out.println(tree.find(-60));
//	System.out.println(tree.height());
	//tree.postorder();
	tree.LevelOrder();
}
}
