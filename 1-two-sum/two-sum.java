class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){//2,7
            if(map.containsKey(target-nums[i])){// 
                newArray[0]=i;//[7]
                newArray[1]=map.get(target-nums[i]);//(0)
            }
            map.put(nums[i],i);//(2,0)
        }
        return newArray;
    }
}