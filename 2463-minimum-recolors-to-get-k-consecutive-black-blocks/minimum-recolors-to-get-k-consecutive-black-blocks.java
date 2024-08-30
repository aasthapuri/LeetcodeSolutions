class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] ch = blocks.toCharArray();
        int start = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int end = k;
        for(int i=0;i<k;i++){
            if(ch[i] == 'W'){
                count++;
                
            }
        }
        min = count; 
        while(end < ch.length){
            if(ch[start++] == 'W') count--;
            if(ch[end++] == 'W') count++;
            min = Math.min(min,count);
        }
        return min;
    }
}