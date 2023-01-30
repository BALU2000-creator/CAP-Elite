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
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return traverse(root, k);
    }
    boolean traverse(TreeNode root, int k){
        if(root==null){
            return false;
        }
        if(set.contains(root.val)){
            return true;
        }
        set.add(k-root.val);
        boolean left = traverse(root.left, k);
        boolean right = traverse(root.right, k);
        return left||right;

    }
}
