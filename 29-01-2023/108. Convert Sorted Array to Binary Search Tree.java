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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int high=nums.length-1, low=0;
        TreeNode root = getTree(nums, low, high);
        return root;
    }
    public TreeNode getTree(int[] nums, int low, int high){
        if(high<low){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode left = getTree(nums, low, mid-1);
        TreeNode right = getTree(nums, mid+1, high);
        TreeNode root = new TreeNode(nums[mid], left, right);
        return root;
    }

}
