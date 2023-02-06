class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<n; i++){
            List<Integer> lis = new ArrayList<>();
            set.add(i);
            adj.add(lis);
        }
        for(int i=0; i<connections.length; i++){
            int u = connections[i][0];
            int v = connections[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int components = 0;
        while(!set.isEmpty()){
            int source = 0;
            for(Integer val : set){
                source = val;
                break;
            }
            dfs(source, adj, set);
            components++;
        }
        System.out.println(components);
        return components-1;
    }
    public void dfs(int source, List<List<Integer>> adj, HashSet<Integer> set){
        set.remove(source);
        for(Integer val : adj.get(source)){
            if(set.contains(val)){
                dfs(val, adj, set);
            }
        }
    }
}
