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
    int height;
    int i=1;
    int sum=0;
    public int getheight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = getheight(root.left);
        int right = getheight(root.right);
        return Math.max(left, right)+1;
    }
    public void getsum(TreeNode root){
        if(root==null){
            return;
        }
        i++;
        getsum(root.left);
        i--;
        if(i==height){
            sum=sum+root.val;
        }
        i++;
        getsum(root.right);
        i--;
    }
    public int deepestLeavesSum(TreeNode root) {
        height = getheight(root);
        getsum(root);
        System.out.println(sum);
        return sum;
    }
}
