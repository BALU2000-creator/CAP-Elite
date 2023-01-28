class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        int max=Integer.MAX_VALUE;
        Node temp=root;
        while(temp!=null){
            if(temp.data==key){
                return temp.data;
            }
            if(temp.data<=max && temp.data>key){
                max=temp.data;
            }
            if(temp.data<key){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        if(max==Integer.MAX_VALUE){
            return -1;
        }
        return max;
    }
}
