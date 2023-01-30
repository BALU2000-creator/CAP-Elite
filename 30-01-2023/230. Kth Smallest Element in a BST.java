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
    int element = 0, solution=0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return solution;
    }
    void traverse(TreeNode root, int k){
        if(root==null){
            return;
        }
        traverse(root.left, k);
        element++;
        if(element==k) solution=root.val;
        traverse(root.right, k);
    }
}
