class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        int n = mat.length;
        for(int i=0;i<mat.length;i++){
            answer += mat[i][i];
            
            answer += mat[n-1-i][i];
        }
        
        if(mat.length%2!=0){
            answer -= mat[n/2][n/2];
        }
        return answer;
    }
}