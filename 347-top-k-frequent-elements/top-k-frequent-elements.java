class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> topFrequent = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int key : map.keySet()){
            topFrequent.add(key);
        }

        int[] answer = new int[k];
        for(int i=0;i<k;i++){
            answer[i] = topFrequent.poll();
        }
        return answer;
    }
}