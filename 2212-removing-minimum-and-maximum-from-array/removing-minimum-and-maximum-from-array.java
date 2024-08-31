class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        
        int j = nums.length-1;
       
        int minIndex = -1;
        int maxIndex = -1;
        while(j>=0){
            if(nums[j]==min){
                minIndex = j;
            }
            if(nums[j]==max){
                maxIndex = j;
            }
            j--;
        }
        if(minIndex<maxIndex){
            int p = maxIndex + 1;
            int p1 = nums.length - minIndex;
            int p2 = minIndex + 1 + nums.length - maxIndex;
            return Math.min(p,Math.min(p1,p2));
        }
        else{
            int p = minIndex + 1;
            int p1 = nums.length - maxIndex;
            int p2 = maxIndex + 1 + nums.length - minIndex;
            return Math.min(p,Math.min(p1,p2));
        }
    }
}