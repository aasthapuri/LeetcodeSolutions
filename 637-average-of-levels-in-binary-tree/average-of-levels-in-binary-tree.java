/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
//         double roundedValue = Math.round(root * 100000.0) / 100000.0;
        
//         list.add(roundedValue);
        
        
        q.add(root);
        while(!q.isEmpty()){
            
            int n = q.size();
            ArrayList<Double> doubleList = new ArrayList<>();
            double sum = 0.0;
            for(int i=0;i<n;i++){
                
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null){
                    q.add(node.left);
                    
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            double average = sum / n;
            list.add(Math.round(average * 100000.0) / 100000.0);
            
        }
        return list;
    }
}