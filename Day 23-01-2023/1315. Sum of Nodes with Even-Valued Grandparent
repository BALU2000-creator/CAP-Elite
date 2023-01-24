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
    public void traverse(TreeNode root){
        if(root!=null){
            if(root.val%2==0){
                extractAndSum(root.left, root.right);
            }
            sumEvenGrandparent(root.left);
            sumEvenGrandparent(root.right);
        }
    }
    public int sumEvenGrandparent(TreeNode root) {
        traverse(root);
        return sum;
    }
    public void extractAndSum(TreeNode l, TreeNode r){
        if(l!=null){
            if(l.left!=null){
                sum = sum + l.left.val;
            }
            if(l.right!=null){
                sum = sum + l.right.val;
            }
        }
        if(r!=null){
            if(r.left!=null){
                sum = sum + r.left.val;
            }
            if(r.right!=null){
                sum = sum + r.right.val;
            }
        }
    }
}
