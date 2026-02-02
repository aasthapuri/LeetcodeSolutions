class Solution {
    public int findMiddleIndex(int[] nums) {
       int leftSum = 0;
       int rightSum = 0;
       int middleIndex = 0;
       for(int i=0;i<nums.length;i++){
            rightSum += nums[i];//16
       } 
       for(int i=0;i<nums.length;i++){
        leftSum = leftSum + nums[i];//12
        if(leftSum==rightSum){
            middleIndex = i;
            return middleIndex; 
        }
        rightSum = rightSum - nums[i];//12
       }
       return -1;
    }
}