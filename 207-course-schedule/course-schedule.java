class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        } 

        for(int[] pre : prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }

        int[] vis = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,vis,adj)){
                    return false;
                }
                
            }
        }

        return true;

    }

    public static boolean dfs(int start, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[start]=1;

        for(int i : adj.get(start)){
            if(vis[i]==0){
                if(dfs(i,vis,adj)){
                    return true;
                }
            }
            else if(vis[i]==1){
                return true;
            }
        }
        vis[start]=2;
        return false;
    }
}
