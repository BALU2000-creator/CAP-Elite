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
    boolean flag = true;
    Queue<Integer> queue = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        if(queue.size()==1 && queue.peek()==root.val) return true;
        if(queue.size()==2){
            int val = queue.poll();
            if(val>=queue.peek()) flag=false;
        }
        return flag;
    }
    void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        if(queue.size()<2){
            queue.add(root.val);
        }    
        else{
            int peek = queue.poll();
            if(peek>=queue.peek()){
                flag = false;
            }
            queue.add(root.val);
        }
        traverse(root.right);
    }
}
