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
    int n=0, i = 1, min=0;
    public int minDepth(TreeNode root) {
        getn(root);
        min = n;
        pointer(root);
        return min;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.min(left, right)+1;
    }
    public void pointer(TreeNode root){
        System.out.println(i);
        if(root==null){
            return;
        }
        if(min>i && (root.right==null && root.left==null)){
            min=i;
        }
        i=i+1;
        pointer(root.left);
        pointer(root.right);
        i=i-1;
    }
    public void getn(TreeNode root){
        if(root==null){
            return;
        }
        n=n+1;
        getn(root.left);
        getn(root.right);
    }

}
