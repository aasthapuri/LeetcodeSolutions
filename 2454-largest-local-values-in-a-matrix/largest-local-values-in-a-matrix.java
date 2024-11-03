class Solution {
    public static int findMax(int[][] grid, int row, int col){
        int max = 0;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                max = Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        
        int[][] max = new int[m-2][m-2];
        
        for(int i=0;i<m-2;i++){
            for(int j=0;j<m-2;j++){
                max[i][j] = findMax(grid,i,j);
            }
        }
        return max;
    }
}