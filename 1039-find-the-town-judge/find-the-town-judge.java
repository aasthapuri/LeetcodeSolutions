class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> map=new HashMap<>();
        if(n==1) return 1;
        for(int[] edge:trust){
            map.put(edge[0],map.getOrDefault(edge[0],0)-1);
            map.put(edge[1],map.getOrDefault(edge[1],0)+1);
        }


        for(int node:map.keySet()){
             System.out.println(node);
            if(map.get(node)==n-1){
               
                return node;
            }
        }
        return -1;
    }
}