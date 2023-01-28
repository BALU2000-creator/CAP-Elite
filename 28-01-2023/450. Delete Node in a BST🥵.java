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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key && root.left==null && root.right==null){
            return null;
        }
        if(root.val==key && root.left==null && root.right!=null){
            return root.right;
        }
        if(root.val==key && root.left!=null && root.right==null){
            return root.left;
        }        
        TreeNode parent = root, temp = root;
        while(temp.val!=key){
            parent = temp;
            if(temp.val<key){
                temp = temp.right;
            }
            else{
                temp = temp.left;
            }
            if(temp==null){
                return root;
            }
        }
        TreeNode curr = temp;
        if(curr.left==null && curr.right==null){
            if(key<parent.val){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        if(curr.left!=null && curr.right!=null){
            parent = curr;
            TreeNode temp1 = curr.left;
            if(temp1.right!=null){
                while(temp1.right!=null){
                    parent = temp1;
                    temp1 = temp1.right;
                }
                int n = temp1.val;
                temp1.val = curr.val;
                curr.val = n;
                if(temp1.left!=null){
                    parent.right=temp1.left;
                }
                else{
                    parent.right = null;
                }
            }else{
                int n = temp1.val;
                temp1.val = curr.val;
                curr.val = n;
                curr.left=temp1.left;
            }
        }
        if(curr.left!=null && curr.right==null){
            if(key<parent.val){
                parent.left = curr.left;
            }
            else{
                parent.right = curr.left;
            }
        }
        else if(curr.left==null && curr.right!=null){
            if(key<parent.val){
                parent.left = curr.right;
            }
            else{
                parent.right = curr.right;
            }           
        }
        return root;
    }
}
