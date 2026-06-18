class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String word = new String(s);

            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(str);
        }
        return new ArrayList<>(map.values());
    }
}