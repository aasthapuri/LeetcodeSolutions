class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
		int i = 0, j = 0;
		int n = nums.length;
		long currSum = 0, maxSum = 0;
		while(j < n){
			if(set.contains(nums[j])){
				set.remove(nums[i]);
				currSum -= nums[i];
				i++;
			}
			else{
				set.add(nums[j]);
				currSum += nums[j];
				j++;
			}
			if((j - i) == k){
				maxSum = Math.max(maxSum, currSum);
				set.remove(nums[i]);
				currSum -= nums[i];
				i++;
			}
		}
		return maxSum;
    }
}