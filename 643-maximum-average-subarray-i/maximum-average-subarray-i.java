class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        int start = 0;
        int end = k;
        double max = 0.0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        max = sum;
        
        while(end<nums.length){
            sum = sum - nums[start++];
            sum = sum + nums[end++];
            max = Math.max(max,sum);
        }
        
        return (double)(max/k);
    }
}