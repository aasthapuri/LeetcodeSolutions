class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        
        for(int[] a : matrix){
            int i = 0;
            int j = a.length-1;
            while(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
    }
    void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}