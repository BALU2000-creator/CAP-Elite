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
    int sum=0;
    public void traverse(TreeNode root, int low, int high){
        if(root!=null){
            if(low<=root.val && root.val<=high){
                sum=sum+root.val;
            }
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root, low, high);
        return sum;
    }
}
