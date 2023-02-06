class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, adj, visited, list);
        return list;
        
    }
    public void dfs(int source , ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> list){
        visited[source]=true;
        list.add(source);
        for(Integer s : adj.get(source)){
            if(!visited[s]){
                dfs(s, adj, visited, list);
            }
        }
    }
}
