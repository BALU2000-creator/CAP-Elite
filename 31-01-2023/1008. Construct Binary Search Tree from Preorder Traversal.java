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
    int i=0;
    private TreeNode structBST(int[] preorder, int a,int b){ 
        if(i>=preorder.length) { return null;}
        int data=preorder[i];
        if(data>a&&data<b){
            i++;
            TreeNode root=new TreeNode(data); 
            root.left=structBST(preorder, a,data);
            root.right=structBST(preorder,data,b);
            return root;
        } 
        return null;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = structBST(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE); 
        return root;
    }
}
