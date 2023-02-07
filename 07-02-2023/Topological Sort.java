class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<V; i++){
            if(!visited[i])
                dfs(i, adj, stack, visited);
        }
        int[] result = new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            result[i]=stack.pop();
            i++;
        }
        return result;
    }
    static void dfs(int source, ArrayList<ArrayList<Integer>> adj, Stack stack, boolean[] visited){
        visited[source] = true;
        for(Integer val : adj.get(source)){
            if(!visited[val]){
                dfs(val, adj, stack, visited);
            }
        }
        stack.add(source);
    }
}
