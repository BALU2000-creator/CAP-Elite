class Solution {
    boolean result = true;
    public boolean isBipartite(int[][] graph) {
        int[] arr = new int[graph.length];
        for(int i=0; i<graph.length; i++)
            if(arr[i]==0) dfs(i, graph, 1, arr);
        return result;
    }
    public void dfs(int source, int[][] graph, int color, int[] arr){
        arr[source] = color;
        for(Integer val : graph[source])
            if(arr[val]==0) dfs(val, graph, -color, arr);
            else if(arr[val]==arr[source]) result=false;
    }
}
