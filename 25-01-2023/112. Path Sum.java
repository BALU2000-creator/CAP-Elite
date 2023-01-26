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
    int sum = 0;
    boolean bo= false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(targetSum==root.val && (root.right==null && root.left==null)){
            return true;
        }
        boolean l , r ;
        l = hasPathSum(root.left, targetSum-root.val);
        r = hasPathSum(root.right, targetSum-root.val);
        return l || r;
        // traverse(root, targetSum);
        // return bo;
    }
    public void traverse(TreeNode root, int target){
        if(root==null){
            return;
        }
        System.out.println(sum);
        System.out.println(bo);

        sum = sum + root.val;
        if(sum==target){
            bo=true;
        }

        traverse(root.left, target);
        if(root.left!=null){
            sum = sum - root.left.val;
        }

        traverse(root.right, target);
        if(root.right!=null){
            sum = sum - root.right.val;
        }
    }
}
