class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length; 
        int col = grid[0].length; 
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    
    public void dfs(int row, int col, char[][]grid){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1 || grid[row][col]=='0'){
            return;
        }
        grid[row][col] = '0';
        
        dfs(row-1,col,grid);
        dfs(row+1,col,grid);
        dfs(row,col-1,grid);
        dfs(row,col+1,grid);
    }
}