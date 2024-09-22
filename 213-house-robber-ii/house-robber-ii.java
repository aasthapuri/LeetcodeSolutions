class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int prev2 = 0;
        int prev1 = nums[0];
        // int prev3 = nums[1];
        
        for(int i=1;i<nums.length-1;i++){
            int max = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = max;
        }
        int loop1 = prev1;
        
        prev2 = 0;
        prev1 = nums[1];
        
        for(int i=2;i<nums.length;i++){
            int max = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = max;
        }
        int loop2 = prev1;
        
        return Math.max(loop1,loop2);
    }
}