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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean isforward=true;
        List<List<Integer>> glob = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        glob.add(list);
        stack.add(root);
        while(!stack.isEmpty()){
            int size = stack.size();
            List<Integer> list1 = new ArrayList<>();
            Stack<TreeNode> stack2 = new Stack<>();
            isforward=!isforward;
            System.out.println("size"+size+" isforward "+isforward+"-"+stack.peek().val);
            for(int i=0; i<size; i++){
                TreeNode currentRoot = stack.pop();
                System.out.println("currentRoot "+currentRoot.val);
                if(isforward){
                    if(currentRoot.left!=null){
                        stack2.push(currentRoot.left);
                    }
                    if(currentRoot.right!=null){
                        stack2.push(currentRoot.right);
                    }
                }
                else{
                    if(currentRoot.right!=null){
                        stack2.push(currentRoot.right);
                    }
                    if(currentRoot.left!=null){
                        stack2.push(currentRoot.left);
                    }
                }
            }
            Queue<TreeNode> q = new LinkedList<>();
            for(TreeNode node: stack2){
                q.add(node);
                list1.add(node.val);
            }
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                stack.push(node);            
            }
            stack2.clear();
            q.clear();
            if(list1.size()>0){
                glob.add(list1);
            }
        }
        return glob;
    }
}
