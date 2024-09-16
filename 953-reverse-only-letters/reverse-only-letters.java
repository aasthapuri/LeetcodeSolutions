class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] array = s.toCharArray();
        while(i<j){
            if(!Character.isLetter(array[i])) i++;
            else if(!Character.isLetter(array[j])) j--;
            else{
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                
            }
        }
        return new String(array);
    }
}