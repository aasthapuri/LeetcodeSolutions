class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int i=0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                count = Math.max(count,set.size());
            }
            else{
                set.remove(s.charAt(j++));
            }
        }
        return count;
    }
}