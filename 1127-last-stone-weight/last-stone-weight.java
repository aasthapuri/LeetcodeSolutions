class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> b-a );

        for(int i : stones){
            q.offer(i);
        }

        while(q.size()>1){
            int x = q.poll();
            int y = q.poll();

            if(x!=y){
                q.offer(x-y);
            }
        }
        return q.isEmpty() ? 0 : q.peek();
    }
}