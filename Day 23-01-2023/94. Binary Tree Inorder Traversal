
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
      }
 }
 
class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
    // public List<Integer> lister(Treenode root){
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    // }
}
