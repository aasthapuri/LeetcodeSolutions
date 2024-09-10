class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                maxLength++;
                count = Math.max(maxLength,count);
            }
            else{
                maxLength = 0;
            }
        }
        
        return count;
    }
}