class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int product = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product = product*nums[i];
            }
            else{
                count++;
            }
        }
        
        if(count>1){
            return new int[nums.length];
        }
        
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(count>0){
                a[i] = (nums[i]==0) ? product : 0;
            }
            else {
                a[i] = product/nums[i];
            }
        }
        return a;
    }
}