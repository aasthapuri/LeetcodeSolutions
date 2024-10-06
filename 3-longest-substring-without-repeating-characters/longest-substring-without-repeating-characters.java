class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        char[] ch = s.toCharArray();
        int max = 0;
        int j = 0;
        int i = 0;
        while( i < ch.length){
            if(!set.contains(ch[i])){
                set.add(ch[i++]);
                max = Math.max(set.size(),max);
            }
            else{
                set.remove(ch[j++]);
            }
            
        }
        return max;
    }
}