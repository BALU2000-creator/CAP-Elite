class Solution {
    public int numIslands(char[][] grid) {
        int row=0, col=0;
        boolean flag = false;
        int k=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    dfs(i,j, grid);
                    k++;
                }
            }
        }
        return k;
        
    }
    public void dfs(int i, int j, char[][] grid){
        grid[i][j]=0;
        int[] x = {i-1, i+1, i, i};
        int[] y = {j, j, j-1, j+1};
        if(i-1==-1) {x[0]=-1; y[0]=-1;}
        if(j-1==-1) {x[2]=-1; y[2]=-1;}
        if(i+1==grid.length){x[1]=-1; y[1]=-1;}
        if(j+1==grid[0].length) {x[3]=-1; y[3]=-1;} 
        for(int k=0; k<4; k++){
            if(x[k]!=-1 && y[k]!=-1){
                if(grid[x[k]][y[k]]=='1'){
                    dfs(x[k], y[k], grid);
                }
            }
        }
    }
}
