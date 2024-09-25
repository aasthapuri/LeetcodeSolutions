class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            
        }
        int answer = 1;
        for(int i=0;i<=nums.length-k;i++){
            answer = q.poll();
            System.out.println(answer);
        }
        
        return answer;
    }
}