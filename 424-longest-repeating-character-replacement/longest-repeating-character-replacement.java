class Solution {
    public int characterReplacement(String s, int k) {
        int replaced = 0;
        int maxCount = 0;
        int length = 0;
        int count = 0;
        int i = 0;
        int[] array = new int[26];
        for(int j=0;j<s.length();j++){
            array[s.charAt(j)-'A']++;
            maxCount = Math.max(maxCount,array[s.charAt(j)-'A']);
            
            if(j-i+1 - maxCount > k){
                array[s.charAt(i)-'A']--;
                i++;
            }
            length = Math.max(length,j-i+1);
        }
        return length;
    }
}
