
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int n=x;
        if(x<0){
            return false;
        }
        while(x>0){
            int remainder = x%10;
            sum = sum*10 + remainder;
            x=x/10;
            // System.out.println(sum);
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}