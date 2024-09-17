class Solution {
    public int minOperations(int[] nums) {
        int one = 0;
        int zero = 0;
        
        int start = 0;
        int end = 0;
        int flip = 0;
        
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i] = 1;
                nums[i+1] = nums[i+1] == 0 ? 1 : 0;
                nums[i+2] = nums[i+2] == 0 ? 1 : 0;
                flip++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                one++;
            }
        }
        
        if(nums.length==one){
            return flip;
        }
        
        return -1;
            
    }
}