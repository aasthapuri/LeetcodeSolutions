class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> list = new ArrayList<>();
        
        for(int[] n : intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<n[0]){
                list.add(n);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],n[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
//1 - 0,0 3 - 0,1
//2 - 0,1 6 - 1,1
//8 - 0,2 10 - 2,1
//15 - 0,3 18 - 3,1