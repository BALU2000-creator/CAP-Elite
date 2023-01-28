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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> glob = new ArrayList<>();
        if(root==null){
            return new ArrayList();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        glob.add(list);
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode currRoot = queue.poll();
                if(currRoot.left!=null){
                    list1.add(currRoot.left.val);
                    queue.add(currRoot.left);
                }
                if(currRoot.right!=null){
                    list1.add(currRoot.right.val);
                    queue.add(currRoot.right);
                }
            }
            if(list1.size()>0){
                glob.add(list1);
            }
        }
        return glob;
    }
}
