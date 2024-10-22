class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        char[] str = s.toCharArray();
        int max = 0;
        int i = 0;
        int j = 0;
        
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));//kew
                max = Math.max(set.size(),max);//2
            }
            else{
                set.remove(s.charAt(j++));
            }
            
        }
        
        return max;
    }
}

