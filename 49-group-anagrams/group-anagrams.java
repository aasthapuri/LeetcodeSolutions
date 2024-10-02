class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(str);
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}                                                                                   