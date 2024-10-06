class Solution {
    public char repeatedCharacter(String s) {
        int[] array = new int[26];
        
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
            
            if(array[s.charAt(i)-'a']==2){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}