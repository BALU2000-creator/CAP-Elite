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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        TreeNode temp = root;
        TreeNode parent = root;
        while(temp!=null){
            parent = temp;
            if(temp.val<val){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        if(parent.val<val){
            parent.right = new TreeNode(val);
        }
        else{
            parent.left = new TreeNode(val);
        }
        return root;
    }
}
