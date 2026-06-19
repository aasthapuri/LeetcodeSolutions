class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countZero = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product = product*nums[i];
            }
            else countZero++;
        }

        if(countZero>1){
            return new int[nums.length];
        }

        int[] answer = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(countZero>0){
                answer[i] = (nums[i]==0) ? product : 0;
            }
            else{
                answer[i] = product/nums[i];
            }
        }

        return answer;
    }
}