class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int[] result = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        } 
        boolean b = false;

        for(int[] pre : prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }

        int[] vis = new int[numCourses];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,vis,adj,stack)){
                    b = true;
                    break;
                }
                
            }
        }
        if (b) {
            return new int[0];
        }

        
        int a = 0;

        while(!stack.isEmpty()){
            result[a++] = stack.pop();
        }
        
        return result;


    }

    public static boolean dfs(int start, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack){
        vis[start]=1;

        for(int i : adj.get(start)){
            if(vis[i]==0){
                if(dfs(i,vis,adj,stack)){
                    return true;
                }
            }
            else if(vis[i]==1){
                return true;
            }
        }
        stack.push(start);
        vis[start]=2;
        return false;
    }
}
