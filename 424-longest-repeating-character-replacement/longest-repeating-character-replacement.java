class Solution {
    public int characterReplacement(String s, int k) {
        
        int ans = 0;
        for(char c = 'A';c<='Z';c++){
            int i = 0;
            int j = 0;
            int n = s.length();
            int r = 0;
            while(j<n){
                if(c==s.charAt(j)){
                    j++;
                }
                else if(r<k){
                    r++;
                    j++;
                }
                else if(c==s.charAt(i)){
                    i++;
                }
                else{
                    r--;
                    i++;
                }
                ans = Math.max(ans,j-i);
            }
        }
        return ans;
    }
}
