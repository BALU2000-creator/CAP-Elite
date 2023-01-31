/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    String preorder = "";    
    int i=0;
    void traverse(TreeNode root){
        if(root==null){
            return;
        }
        preorder = preorder+root.val+" ";
        serialize(root.left);
        serialize(root.right);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        traverse(root);
        return preorder;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arrOfStr = data.split(" ");
        System.out.println(data);
        int[] arr = new int[arrOfStr.length];

        for(int i=0; i<arrOfStr.length; i++){
            arr[i] = Integer.parseInt(arrOfStr[i]);
        }
        for(Integer val : arr)
        System.out.println(val);
        int bound = Integer.MAX_VALUE, i = 0;
        return structBST(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode structBST(int[] preorder, int a,int b){ 
        if(i>=preorder.length) { return null;}
        int data=preorder[i];
        if(data>a&&data<b){
            i++;
            TreeNode root=new TreeNode(data); 
            root.left=structBST(preorder, a,data);
            root.right=structBST(preorder,data,b);
            return root;
        } 
        return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
