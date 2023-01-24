public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    TreeNode tget;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getTarget(cloned, target.val);
    }
    public TreeNode getTarget(TreeNode root, int val){
        if(root!=null){
            if(val==root.val){
                tget = root;
            }
            getTarget(root.left, val);
            getTarget(root.right, val); 
        }
        return tget;
    }
}
