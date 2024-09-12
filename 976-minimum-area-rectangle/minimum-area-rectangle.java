class Solution {
    public int minAreaRect(int[][] points) {
        HashSet<String> set = new HashSet<>();
        for(int[] point : points){
            set.add(point[0] + " , " + point[1]);
        }
        int min_area = Integer.MAX_VALUE;
        for(int[] p1 : points){
            for(int[] p2 : points){
                if(p1[0] != p2[0] && p1[1] != p2[1]) {
                    if(set.contains(p1[0] + " , " +p2[1]) && 
                        set.contains(p2[0] + " , " +p1[1])) {
                        int area = Math.abs(p1[0] - p2[0]) * Math.abs(p1[1] - p2[1]);
                        min_area = Math.min(min_area, area);
                    }
                }
            }
        }
        return min_area == Integer.MAX_VALUE ? 0 : min_area;
    }
}