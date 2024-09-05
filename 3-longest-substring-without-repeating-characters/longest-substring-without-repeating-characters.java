class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int j = 0;
        int i = 0;
        while(i < s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                maxLength = Math.max(maxLength,set.size());
            }
            else{
                set.remove(s.charAt(j++));
            }
        }
        return maxLength;
    }
}