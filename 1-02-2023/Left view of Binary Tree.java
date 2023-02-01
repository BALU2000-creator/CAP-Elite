class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root, 0, list);
        return list;
    }
    void traverse(Node root, int level, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(level==list.size()) list.add(root.data);
        traverse(root.left, level+1, list);
        traverse(root.right, level+1, list);
    }
}
