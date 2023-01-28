/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = root;
        int min=p.val, max=q.val;
        if(p.val>q.val){
            min=q.val;
            max=p.val;
        }
        while(!(min<=temp.val && temp.val<=max)){
            if(min>temp.val && temp.val<max){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
            if(temp==null){
                return null;
            }
        }
        return temp;
    }
}
