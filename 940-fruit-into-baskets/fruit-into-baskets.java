class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                    if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                    }
                    left++;
                }
                
            }
            if(map.size()<=2){
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
        }
        return maxLength;
    }
}