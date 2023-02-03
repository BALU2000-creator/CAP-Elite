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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if(root1==null && root2==null){
            return list;
        }
        else if(root1==null){
            traverse1(root2, list);
            traverse2(root1, list, 0);
        }
        else{
            traverse1(root1, list);
            traverse2(root2, list, 0);
        }
        return list;
    }
    void traverse2(TreeNode root, List<Integer> list, int i){
        if(root==null){
            return;
        }
        traverse2(root.left, list, i);
        if(i==list.size()-1){
            list.add(root.val);
        }
        else if(list.get(i)>=root.val){
            list.add(i,root.val);
        }else{
            while(i<list.size() && !(root.val<=list.get(i))){
                i++;
            }
            list.add(i, root.val);
        }
        traverse2(root.right, list, i);
    }
    void traverse1(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        traverse1(root.left, list);
        list.add(root.val);
        traverse1(root.right, list);
    }
}
