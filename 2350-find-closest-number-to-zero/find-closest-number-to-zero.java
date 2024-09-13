class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(Math.abs(nums[i])<min){
                min = Math.abs(nums[i]);
                answer = nums[i];
            }
            if(set.contains(-1*answer)){
                answer = Math.abs(answer);
            }
            
        }
        return answer;
    }
}