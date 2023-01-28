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
    // public boolean checkleftskew(TreeNode root){
    //     boolean flag = false;
    //     int c = 0;
    //     while(root.left==null){
    //         c=c+1;
    //         root = root.right;
    //         if(root.right==null){
    //             break;
    //         }
    //     }
    //     if(c==n){
    //         flag = true;
    //     }
    //     return flag;
    // }
    // public boolean checkrightskew(TreeNode root){
    //     boolean flag = false;
    //     int c = 0;
    //     while(root.right==null){
    //         c=c+1;
    //         root = root.left;
    //         if(root.left==null){
    //             break;
    //         }
    //     }
    //     if(c==n){
    //         flag = true;
    //     }
    //     return flag;
    // }
}
