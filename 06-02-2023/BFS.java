class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] visited = new boolean[V];
        queue.add(0);
        visited[0] = true;
        list.add(0);
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(Integer val : adj.get(node)){
                if(!visited[val]){
                    visited[val]=true;
                    list.add(val);
                    queue.add(val);
                }
            }
        }
        return list;
    }
}
