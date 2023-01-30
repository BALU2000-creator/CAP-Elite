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
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] arr={0};
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode node = constructTree(arr, preorder, inorder, 0, inorder.length-1);
        return node;
    }

    TreeNode constructTree(int[] arr, int[] preorder, int[] inorder, int low, int high){
        if(high<low){
            return null;
        }
        int val = preorder[arr[0]++];
        int bound = map.get(val);
        TreeNode left = constructTree(arr, preorder, inorder, low, bound-1);
        TreeNode right = constructTree(arr, preorder, inorder, bound+1, high);
        return new TreeNode(val, left, right);
    }
}
