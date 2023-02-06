class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0; i<isConnected.length; i++){
            for(int j=0; j<isConnected[0].length; j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        boolean[] visited=new boolean[isConnected.length];
        int k=0;
        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]){
                dfs(i, adj, visited);
                k++;
            }
        }
        return k;
    }
    public void dfs(int source, List<List<Integer>> adj, boolean[] visited){
        visited[source]=true;
        for(Integer val : adj.get(source)){
            if(!visited[val]){
                dfs(val, adj, visited);
            }
        }
    }
}
