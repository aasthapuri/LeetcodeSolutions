class Solution {
    public int removeElement(int[] nums, int val) {
        //[3,2,2,3], val = 3
        int j = 0;
        for(int i=0;i<nums.length;i++){//3
            if(nums[i]!=val){//2
                nums[j]=nums[i];//2
                j++;//2
            }
            
        }
        return j;//2,2
    }
}