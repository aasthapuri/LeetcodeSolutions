class Solution {
    public int arrangeCoins(int n) {
        long counter = 0;
        int result = 0;
        int i = 0;
        
        while(counter<n){//5
            i++;
            counter += i;
            
            
            if (counter <= n) {
                result = i;
            }
        }
        return result;
    }
}