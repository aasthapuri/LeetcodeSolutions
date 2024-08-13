class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        char[] s1 = s.toCharArray();
        if(s.length() != t.length()) return false;
        boolean answer = false;
        char[] t1 = t.toCharArray();
        if (s.equals(t)) return true;
        for(int i=0;i<s1.length;i++){
            if(map.containsKey(s1[i])){
                char a = map.get(s1[i]);
                System.out.println("map.get(s1[i]) " + a + " " + t1[i]);
                if(a!=t1[i]){
                    return false;
                }
            }
            else{
                if(map.containsValue(t1[i])){
                    return false;
                }
                map.put(s1[i],t1[i]);
                answer = true;
            }
        }
        return answer;
    }
}