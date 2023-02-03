	void decode(String s, Node root) {
        Node temp = root;
        int i = 0;
        while(i<s.length()){
            while(temp.left!=null || temp.right!=null){
                if(s.charAt(i)=='1'){
                    temp = temp.right;
                }
                else{
                    temp = temp.left;
                }
                i++;
            }
            System.out.print(temp.data);
            temp = root;
        }  
    }
