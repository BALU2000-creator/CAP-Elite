class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, 0, list);
        return list;
    }
    void traverse(TreeNode root, int level, List<Integer> list){
        if(root==null){
            return;
        }
        if(level==list.size()) list.add(root.val);
        traverse(root.right, level+1, list);
        traverse(root.left, level+1, list);
    }
}
