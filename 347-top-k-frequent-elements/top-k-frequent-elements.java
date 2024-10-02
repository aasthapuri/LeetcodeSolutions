class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Integer> q = new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
        
        for(int key : map.keySet()){
            q.offer(key);
            if(q.size()>k){
                q.poll();
            }
        }
        System.out.println(map);
        int ans[] = new int[k];
        
        for(int i=0;i<ans.length;i++){
            ans[i] = q.poll();
        }
        
        return ans;
    }
}