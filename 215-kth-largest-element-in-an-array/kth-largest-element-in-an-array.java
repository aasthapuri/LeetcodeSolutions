class Solution {
    public int findKthLargest(int[] nums, int k) {
        int answer = 0;
        PriorityQueue<Integer> kLargest = new PriorityQueue<>();

        
        for(int i=0;i<nums.length;i++){
            kLargest.add(nums[i]);
        }

        for(int i=0;i<=nums.length-k;i++){
            answer = kLargest.poll();
        }

        return answer;
    }
}