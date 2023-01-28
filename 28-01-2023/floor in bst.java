class Solution {
    public static int floor(Node root, int x) {
        if (root == null) return -1;
        int min=Integer.MIN_VALUE;
        Node temp=root;
        while(temp!=null){
            if(temp.data==x){
                return temp.data;
            }
            if(temp.data>=min && temp.data<x){
                min=temp.data;
            }
            if(temp.data<x){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        if(min==Integer.MIN_VALUE){
            return -1;
        }
        return min;
    }
}
