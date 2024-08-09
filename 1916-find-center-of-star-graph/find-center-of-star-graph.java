class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] t : edges){
            int a = t[0];
            int b = t[1];
            map.put(a,map.getOrDefault(a,0)+1);
            map.put(b,map.getOrDefault(b,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==edges.length){
                return entry.getKey();
            }
        }
        
        return -1;
    }
}