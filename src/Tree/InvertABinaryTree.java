package Tree;

/**
 * Leetcode: 226
 **/
public class InvertABinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode node = new TreeNode(root.val);

        node.right = invertTree(root.left);
        node.left = invertTree(root.right);

        return node;
    }
}
