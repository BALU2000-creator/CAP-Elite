class GfG
{
    public void findPreSuc(Node root, Res p, Res s, int key){
        if(root==null){
            p.pre=null;
            s.succ=null;
        }
        Node max = new Node(Integer.MIN_VALUE), min = new Node(Integer.MAX_VALUE), temp=root;
        while(temp!=null){
            if(temp.data==key){
                break;
            }
            if(temp.data<key){
                min=temp;
                temp = temp.right;
            }
            else{
                max=temp;
                temp = temp.left;
            }
        }
        if(temp==null){
            p.pre = min.data!=Integer.MAX_VALUE?min:null;
            s.succ = max.data!=Integer.MIN_VALUE?max:null;
        }
        else{
            Node temp1 = temp, temp2 = temp;
            if(temp1.left!=null){
                temp1=temp1.left;
                while(temp1.right!=null) temp1=temp1.right;
                p.pre=temp1;
            }
            else{
                p.pre = min.data!=Integer.MAX_VALUE?min:null;
            }
            if(temp2.right!=null){
                temp2=temp2.right;
                while(temp2.left!=null) temp2=temp2.left;
                s.succ=temp2;
            }
            else{
                s.succ = max.data!=Integer.MIN_VALUE?max:null;
            }
        }
    }
}
