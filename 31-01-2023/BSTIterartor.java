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
class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stack; 
    public BSTIterator(TreeNode root) {
        root = root;
        stack = new Stack<>();
        pushall(root);
    }
    public void pushall(TreeNode root){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
    public int next() {
        TreeNode element = stack.pop();
        if(element.right!=null){
            root = element.right;
            pushall(root);
        }
        return element.val;
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
