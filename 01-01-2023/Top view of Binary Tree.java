   static class Pair{
        Node root; 
        int offset;
        Pair(Node root, int offset){
            this.root = root;
            this.offset = offset;
        }
    }
    public static void topView(Node root) {

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        if(!map.containsKey(0)) map.put(0,root.data);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Pair obj = queue.remove();
                Node temp = obj.root;
                int offset = obj.offset;
                if(temp.left!=null){
                    queue.add(new Pair(temp.left, offset-1));
                }
                if(temp.right!=null){
                    queue.add(new Pair(temp.right, offset+1));
                }
            } 
            for(Pair obj:queue){
                    Node node = obj.root;
                    int offset = obj.offset;
                    if(!map.containsKey(offset)){
                        map.put(offset, node.data);
                    }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             System.out.print(entry.getValue()+" ");
        }  
    }
