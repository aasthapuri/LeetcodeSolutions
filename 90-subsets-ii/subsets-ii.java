class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        generateUniqueSubsets(0,nums, new ArrayList<>(), list);
        return list;
    }
    void generateUniqueSubsets(int j, int[] nums, List<Integer> temp, List<List<Integer>> list){
        list.add(new ArrayList<>(temp));
        
        for(int i=j;i<nums.length;i++){
            if(i>j && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            generateUniqueSubsets(i+1,nums,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}

 