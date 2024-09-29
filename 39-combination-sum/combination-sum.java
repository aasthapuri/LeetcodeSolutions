class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        generateSubsets(0, candidates, list, new ArrayList<>(), target);
        return list;
    }
    
    void generateSubsets(int index, int[] nums, List<List<Integer>> list, ArrayList<Integer> temp, int target){
        
        if(target==0){
            list.add(new ArrayList<>(temp));
        }
        if(target<0){
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            generateSubsets(i,nums,list,temp,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}