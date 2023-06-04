package session35;

public class rightview {
	public static void main(String[] args) {

	}

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList();
		view(root, 0, list);
		return list;
	}

	public void view(TreeNode node, int currlevel, List<Integer> ans) {
		if (node == null)
			return;
		if (currlevel == ans.size()) {
			ans.add(node.val);
		}
		view(node.right, currlevel + 1, ans);
		view(node.left, currlevel + 1, ans);
	}

}
