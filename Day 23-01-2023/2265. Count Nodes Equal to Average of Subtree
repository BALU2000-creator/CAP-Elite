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
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        getsum(root);
        return c;
    }
    int getsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = getsum(root.left);
        int r = getsum(root.right);
        if((l+r+root.val)/getcount(root)==root.val){
            c++;
        }
        return l+r+root.val;
        
    }
    int getcount(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = getcount(root.left);
        int r = getcount(root.right);
        return l+r+1;
    }
}
