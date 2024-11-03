class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i=nums.length-1;i>=0;i--){//
            right[i] = rightSum;
            rightSum += nums[i];//8
            //
            
            right[nums.length-1] = 0;
            System.out.println(right[i] + " right");
        }
        
        
        for(int i=0;i<=nums.length-1;i++){
            left[i] = leftSum;
            leftSum += nums[i];
            
            
            left[0] = 0;
            System.out.println(left[i] + " left");
        }
        
        
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(left[i] - right[i]);
        }
        return nums;
    }
}