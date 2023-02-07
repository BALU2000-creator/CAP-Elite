class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        dfs(sr, sc, image, color, image[sr][sc]);
        return image;
    }
    public void dfs(int sr, int sc, int[][] image, int color, int originalColor){
        image[sr][sc]=color;
        int[] x = {sr-1, sr+1, sr, sr};
        int[] y = {sc, sc, sc-1, sc+1};
        for(int i=0; i<4; i++){
            if(x[i]!=-1 && x[i]!=image.length && y[i]!=-1 && y[i]!=image[0].length){
                if(image[x[i]][y[i]]==originalColor){
                    dfs(x[i], y[i], image, color, originalColor);
                }
            }
        }
    }
}
