package session33;

public class SAMETREE {
	public class TreeNode {
		int val;
		public TreeNode left;
		public TreeNode right;

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

	class Solution {
		public boolean isSameTree(TreeNode p, TreeNode q) {
			if (p == null && q != null)
				return false;
			if (p != null && q == null)
				return false;
			if (p == null && q == null)
				return true;
			if (p.val != q.val)
				return false;
			boolean isleftsame = isSameTree(p.left, q.left);
			boolean isrightSame = isSameTree(p.right, q.right);
			return isleftsame && isrightSame;

		}
	}

}
