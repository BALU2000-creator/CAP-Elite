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
    public boolean evaluateTree(TreeNode root) {
        int l = traverse(root);
        if(l==0){
            return false;
        }
        else{
            return true;
        }
    }
    public int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        if(root.val==2){
            return left+right;
        }
        else if(root.val==3){
            return left*right;
        }
        else{
            return root.val;
        }
    }
}
