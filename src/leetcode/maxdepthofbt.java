package leetcode;

public class maxdepthofbt {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int maxDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int lh = maxDepth(node.left);
		int rh = maxDepth(node.right);
		return Math.max(lh, rh) + 1;

	}
}
