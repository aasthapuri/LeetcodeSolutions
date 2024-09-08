class Solution {
    public int longestOnes(int[] nums, int k) {
        int j = 0;
        int count = 0;
        int i =0;
        while(i<nums.length){
            if(nums[i]==0){
                count++;
            }
            i++;
            if(count>k){
                if(nums[j]==0){
                    count--;
                }
                j++;
            }
        }
        return i-j;
    }
}