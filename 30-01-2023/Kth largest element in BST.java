class Solution
{
    int element = 0, solution=0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        int k = K;
        traverse(root, k);
        return solution;
    }
    void traverse(Node root, int k){
        if(root==null){
            return;
        }
        traverse(root.right, k);
        element++;
        if(element==k) solution=root.data;
        traverse(root.left, k);
    }
}
