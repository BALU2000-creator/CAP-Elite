void decode(String s, Node root) {

        Node temp = root;
        String res = "";
        int i=0;
        while(i<s.length()){
                char ch = s.charAt(i);
              
                if(ch =='1'){
                    if(temp.right == null){
                        temp = root;
                    }
                    temp = temp.right;
                    res = res + temp.data;
                }
                if(ch=='0'){
                    if(temp.left == null){
                        temp = root;
                    }
                    temp = temp.left;
                    res = res + temp.data;
                }
                i++;
        }
        System.out.print(res);
      
    }
