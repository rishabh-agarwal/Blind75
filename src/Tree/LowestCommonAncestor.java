package Tree;

/**
 * Leetcode: 235
 **/
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;

        return dfs(root, p, q);
    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){

        if(p.val > root.val && q.val > root.val){
            return dfs(root.right, p, q);
        }
        if(p.val < root.val && q.val < root.val){
            return dfs(root.left, p, q);
        }

        return root;
    }
}
