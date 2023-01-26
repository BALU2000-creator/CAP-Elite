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
    int max = Integer.MIN_VALUE, currentmax=0;
    public int maxPathSum(TreeNode root) {
        int out = traverse(root);
        if(out>max){
            return out;
        }else{
            return max;
        }
    }
    public int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        if(left==0 && right==0){
            if(max<root.val){
                max=root.val;
            }
            return root.val;
        }
        if(left+right+root.val>max){
                max = left+right+root.val;
        }
        currentmax = Math.max(left+root.val, right+root.val);
        max = Math.max(max,Math.max(currentmax, root.val));
        return Math.max(currentmax, root.val);
    }
}
