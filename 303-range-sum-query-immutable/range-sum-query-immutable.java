class NumArray {
    int sum = 0;
    int[] sumArray;
    public NumArray(int[] nums) {
        sumArray = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            sumArray[i] = nums[i];
        }
        
        
    }
    
    public int sumRange(int left, int right) {
        sum = 0;
        for(int i=left;i<=right;i++){
            sum = sum + sumArray[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */