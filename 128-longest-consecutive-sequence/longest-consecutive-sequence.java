class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums){
            set.add(n);
            
        }
        int max = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int count = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        System.out.println(set);
        return max;
    }
}