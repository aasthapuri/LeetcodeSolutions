import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> q = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            q.add(new BigInteger(nums[i]));
            
            if(q.size()>k){
                q.remove();
            }
        }
        return q.peek().toString();
    }
}