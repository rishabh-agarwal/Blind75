package Tree;

/**
 * Leetcode: 100
 **/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p!=null && q!=null && p.val==q.val ){
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }else{
            return false;
        }
    }
}
