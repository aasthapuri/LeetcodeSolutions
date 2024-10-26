class Solution {
    public boolean exist(char[][] board, String word) {
        
        int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (board[i][j] == word.charAt(0)) {
                    if(dfs(i,j,board,word,0)){
                        return true;
                    }
                }
            }
                
        }
        return false;
    }
    
    public static boolean dfs(int i, int j, char[][] board, String word, int index){
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        
        if (index == word.length() - 1) {
            return true;
        }
        
        board[i][j] = '&';
        
        if(dfs(i+1,j,board,word,index+1) || dfs(i-1,j,board,word,index+1) || dfs(i,j-1,board,word,index+1) || dfs(i,j+1,board,word,index+1)){
            return true;
        }
        
        board[i][j] = word.charAt(index);
        
        return false;
    }
}