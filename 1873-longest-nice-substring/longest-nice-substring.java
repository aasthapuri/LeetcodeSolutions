class Solution {
    public String longestNiceSubstring(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String shortString = s.substring(i,j);
                
                if(shortString.length()>1 && shortString.length()>str.length() && isNice(shortString)){
                   str = shortString;
                }
            }
        }
        return str;
    }
    
    public Boolean isNice(String str){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));//YazAy
        }
        for(int i=0;i<str.length();i++){
            if(!set.contains(Character.toUpperCase(str.charAt(i))) || !set.contains(Character.toLowerCase(str.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}