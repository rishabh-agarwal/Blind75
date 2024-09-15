package Tree;

/**
 * Leetcode: 98
 **/
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public boolean dfs(TreeNode node, double left, double right){
        if(node == null)
            return true;

        if(! (node.val < right && node.val  > left))
            return false;

        return dfs(node.right, node.val, right) && dfs(node.left, left, node.val);
    }
}
