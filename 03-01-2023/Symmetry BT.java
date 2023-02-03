/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetry(root.left, root.right);
    }
    boolean symmetry(TreeNode l, TreeNode r){
        if(l==null & r==null)
            return true;
        else if(l==null || r == null || l.val!=r.val) 
            return false;
        boolean lr = symmetry(l.left, r.right);
        boolean rl = symmetry(l.right, r.left);
        return lr&&rl;
    }
}
