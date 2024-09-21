class Solution {
    public void setZeroes(int[][] arr){
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> column = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row.contains(i) || column.contains(j)){
                    arr[i][j]=0;
                }
            }
        }

    }
}
