class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        
        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(char key : map.keySet()){
            q.offer(key);
        }
        int n = q.size();
        
        StringBuilder str = new StringBuilder();
        
        while(!q.isEmpty()){
            char c = q.poll();
            int freq = map.get(c);
            
            for(int i=0;i<freq;i++){
                str.append(c);
            }
        }
        return str.toString();
    }
}