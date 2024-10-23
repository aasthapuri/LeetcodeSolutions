class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O' && (i==0 || j==0 || i==row-1 || j==col-1)){
                    dfs(i,j,board);
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='T'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    public void dfs(int row, int col, char[][] board){
        
        
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!='O'){
            return;
        }
        
        board[row][col] = 'T';
        
        dfs(row-1,col,board);
        dfs(row+1,col,board);
        dfs(row,col-1,board);
        dfs(row,col+1,board);
        
    }
}