import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 1: Count occurrences of each number
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        
        // Step 2: Add numbers that occur exactly twice to the list
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 2) {
                list.add(num);
            }
        }
        
        // Step 3: Convert list to an array of size 2
        int[] result = new int[2];
        for (int i = 0; i < Math.min(list.size(), 2); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
