class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int leftcount = 0;
        
        boolean minimum = false;
        boolean maximum = false;
        
        int i = 0;
        while(i<nums.length && (!minimum || !maximum)){
            if(nums[i]==min){
                minimum = true;
            }
            if(nums[i]==max){
                maximum = true;
            }
            leftcount++;
            i++;
        }
        int j = nums.length-1;
        minimum = false;
        maximum = false;
        int rightcount = 0;
        int minIndex = -1;
        int maxIndex = -1;
        while(j>=0 && (!minimum || !maximum)){
            if(nums[j]==min){
                minimum = true;
                minIndex = j;
            }
            if(nums[j]==max){
                maximum = true;
                maxIndex = j;
            }
            rightcount++;
            j--;
        }
        int index = Math.max(minIndex,maxIndex);
        int index2 = Math.min(minIndex,maxIndex);
        int index3 = index2+nums.length-index+1;
        
        int minimumCount = Math.min(leftcount,rightcount);
        int minCount = Math.min(minimumCount,index3);
        return minCount;
    }
}