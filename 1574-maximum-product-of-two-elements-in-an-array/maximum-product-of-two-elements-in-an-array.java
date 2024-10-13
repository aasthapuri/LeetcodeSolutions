class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        
        for(int n : nums){
            q.offer(n);
        }
        
        int x = q.poll()-1;
        int y = q.poll()-1;
        
        return x*y;
    }
}