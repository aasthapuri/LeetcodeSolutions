class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min = 0;
        
        char[] c = colors.toCharArray();
        
        for(int i=0;i<neededTime.length-1;i++){
            if(c[i]==c[i+1]){
                if(neededTime[i]<neededTime[i+1]){
                    min += neededTime[i];
                }
                else{
                    min += neededTime[i+1];
                    neededTime[i+1] = neededTime[i];
                }
            }   
        }
        return min;
    }
}