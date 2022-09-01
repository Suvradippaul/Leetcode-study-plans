```
class Solution {
    public int countNodes(TreeNode root) {
		if (root == null) return 0;
		
		int leftSubtreeHeight = leftHeight(root.left);
		int rightSubtreeHeight = rightHeight(root.right);
		
		if (leftSubtreeHeight == rightSubtreeHeight) return ((1<<(leftSubtreeHeight+1))-1);
		else return 1 + countNodes(root.left) + countNodes(root.right);
	}

	int rightHeight(TreeNode node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.right;
		}
		return height;
	}

	int leftHeight(TreeNode node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.left;
		}
		return height;
	}
}
```